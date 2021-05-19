package com.voja.spring.config;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.voja.interceptor.ExecutionTimerInterceptor;
import com.voja.interceptor.HeaderInterceptor;

@Configuration
@ComponentScan("com.voja.spring")
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter   {
	
	
	@Autowired
	private HeaderInterceptor headerInterceptor;
	private ExecutionTimerInterceptor exectionTimerInterceptor;
	
	
	@Autowired
	
	
    @Bean
    public DataSource datasource()
    {
    	final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
    	dsLookup.setResourceRef(true);
    	DataSource dataSource = dsLookup.getDataSource("/jdbc/springdb");
    	return dataSource;
    }
  ///  @Bean
    /// public RequestMappingHandlerMapping requestMappingHandlerMapping()
     {
    	/// RequestMappingHandlerMapping rmhm = new  RequestMappingHandlerMapping();
    ///	 rmhm.setUseSuffixPatternMatch(true);
    	/// rmhm.setUseTrailingSlashMatch(true);
    	/// return rmhm;
     }
    
	@Bean
	public UrlBasedViewResolver urlBasedViewResolver()
	{
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
				resolver.setPrefix("/WEB-INF/views/");
				resolver.setSuffix(".jsp");
				resolver.setViewClass(JstlView.class);
				return resolver;

}
	public void addViewControllers(ViewControllerRegistry registry)
	{
		registry.addViewController("/").setViewName("TestMvcHome");
	}
	
	
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor( headerInterceptor); 
		registry.addInterceptor(exectionTimerInterceptor).addPathPatterns("/location");
		
	}
}
