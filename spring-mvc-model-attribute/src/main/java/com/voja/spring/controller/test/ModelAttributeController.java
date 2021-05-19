package com.voja.spring.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAttributeController 



private static Logger LOGGER= LoggerFactory.getlogger(ModelAttributeDemoController.class);


@RequestMapping(value="/home")
public String home()
{
	Logger.info("Inside home" + System.currentTimeMilis());
	
	return "Model Attribute Home";
	
}


@RequestMapping(value="/home2")
public ModelAndView home2()
{
	
	
	ModelAndView mav =  new ModelAndView();
	
	mav.setViewName("modelAttributeHome);"
		
		mav.addObject("anAdress", new Adress());
		
		return mav;
		
			
}

@RequestMapping(value="/home3")
public ModelAndView home3()
{
	
	
	ModelAndView mav =  new ModelAndView();
	
	mav.setViewName("modelAttributeHome);"
		
		mav.addObject("anAdress", new Adress());
		
		return mav;
		
			
}



@RequestMapping(value="/home4")
public ModelAndView home4()
{
	
	
	ModelAndView mav =  new ModelAndView();
	
		
		mav.addObject("anAdress", new Adress());
		
		return newModelAndView("ModelAtributeHome","anAdress", new Adress ("Melbourne","3000"));
		
		
		
		
		
			
}




@ModelAttribute()
public modelAttributeTest1(Model model)
{
	
	Logger.info("INSIDE model attribute test 1" + System.currentTimeMilis());
	
	model.addAttribute("testdata1", "Welcome to @ModelAttribute test");
	

	model.addAttribute("testdata1B, "testing usages of @ModelAttribute")
	
	
}






@ModelAttribute(name="test2")
public modelAttributeTest2(Model model)
{
	
	Logger.info("INSIDE model attribute test 2" + System.currentTimeMilis());
		

	model.addAttribute("testdata1B, ");
	
			return "We will conduct the test here";
	
}



@ModelAttribute(valuee="test3")
public modelAttributeTest2(Model model)
{
	
	Logger.info("INSIDE model attribute test 3" );
		

	
			return  new Adress ("Adelaide","5000");
	
}


@ModelAttribute(valuee="test4")
public modelAttributeTest4(Model model)
{
	
	Logger.info("INSIDE model attribute test 4" );
		

	
			return  new Adress ("Adelaide","5000");
	
}


