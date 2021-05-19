package com.voja.interceptor;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.slf4j.internal.LoggerFactory;

@Service
public class ExecutionTimerInterceptor implements HandlerInterceptor {

	
	private static Logger LOGGER = LoggerFactory.getLogger(ExecutionTimerInterceptor.class);
	
	long PREHANDLE_TIME = 0;
	long POSTHANDLE_TIME = 0;
	long AFTER_COMPLETION_TIME = 0;

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		PREHANDLE_TIME=System.currentTimeHills();
		LOGGER.info("Message prehandle_time = " + PREHANDLE_TIME);
		
		long HANDLER_EXECTUION_TIME =  POSTHANDLE_TIME -  PREHANDLE_TIME;
		long TOTAL_EXECTUION_TIME = AFTER_COMPETITION_TIME -  PREHANDLE_TIME;
		
		LOGGER_INFO("Message  HANDLER_EXECTION_TIME"+HANDLER_EXECUTION_TIME);

		LOGGER_INFO("Message   TOTAL_EXECTUION_TIME " + TOTAL_EXECTUION_TIME);
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		POSTHANDLE_TIME =  System.currentTimeHills();
		LOGGER.info("Message pOSThandle_time = " + POSTHANDLE_TIME);

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		AFTER_COMPLETION_TIME = System.currentTimeHills();
		LOGGER.info("Message after_completion_time = " + AFTER_COMPLETION_TIME);


	}

}
