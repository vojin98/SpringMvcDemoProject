package com.voja.spring.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/requestMappingAndParam")
@Controller
public class RequestMappingAndParamController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(RequestMappingAndParamController.class);

	@RequestMapping(value="/home")
	public String home()
	
	{
		return " requestMappingAndParam";
	}
	
	@RequestMapping(value = "/test1")
	public String requestMappingAndParamTest1 (@RequestParam("orgName") String orgName, Model model   )
	{
		model.addAttribute("orgame", orgName);
		
		model.addAttribute("testSerial", "test1");
		
		return " requestMappingAndParam";
			
	}
	@RequestMapping(value = "/test2",method=RequestMethod.GET)

	public String requestMappingAndParamTest2(@RequestParam("@orgname") String orgName,Model model   )
	{
		

		model.addAttribute("orgame", orgName);
		
		model.addAttribute("testSerial", "test2");
		
		return " requestMappingAndParam";
			
		
	}
	
	@RequestMapping(value = "*",method=RequestMethod.GET)

	public String requestMappingAndParamTest3()
	{
		return "fallback";
		
	}
	
	
	@RequestMapping(value = "/test4",method=RequestMethod.GET)
	
	public String requestMappingAndParamTest4(@RequestParam(value="@orgname", defaultValue="Anonymus Organization") String orgName,Model model   )

	{
		
	model.addAttribute("orgame", orgName);
		
		model.addAttribute("testSerial", "test4");
		return "requestMappingAndResults";
		
	}
	
@RequestMapping(value = "/test5",method=RequestMethod.GET)
	
	public String requestMappingAndParamTest5(@RequestParam String "@orgname", Model model   )
	
	

	{
		
	model.addAttribute("orgame", orgName);
		
		model.addAttribute("testSerial", "test5");
		return "requestMappingAndResults";
		
	}

@RequestMapping(value = "/test6",params="orgname")

public String requestMappingAndParamTest6subtest1(@RequestParam String orgname, Model model   )



{
	
model.addAttribute("orgame", orgname);
	

	model.addAttribute("testSerial", "test6-subtest");
	return "requestMappingAndResults2";
	
}
	

@RequestMapping(value = "/test6", params="empcount")

public String requestMappingAndParamTest6subtest2(@RequestParam String empcount, Model model   )



{
	
model.addlAttribute("orgame", orgName);
	
	model.addAttribute("testSerial", "test6-subtest2");
	return "requestMappingAndResults2";
	
}



@RequestMapping(value = "/test6/subtest3", method=RequestMethod.GET , params= {"orgname","empcount"})

public String requestMappingAndParamTest6subtest3(@RequestParam String orgname, @RequestParam String empCount, Model model   )




{
	
model.addlAttribute("orgame", orgName);
	
model.addAttribute("empCount", empCount);


	model.addAttribute("testSerial", "test6-subtest3");
	return "requestMappingAndResults2";
	
}



@RequestMapping(value = "/test6/subtest4", method=RequestMethod.GET , params= {"orgname","empcount"})

public String requestMappingAndParamTest6subtest4(@RequestParam String orgname, @RequestParam String empCount, Model model   )




{
	
model.addAttribute("orgame", orgName);
	
model.addAttribute("empCount", empCount);


	model.addAttribute("testSerial", "test6-subtest4");
	return "requestMappingAndResults2";
	
}



@RequestMapping(value = {"/test7", "/test8"} method=RequestMethod.GET )

public String requestMappingAndParamTest7And8(@RequestParam String orgname,  Model model  , HttpServletRequest request )




{
	
model.addlAttribute("orgame", orgName);
	
model.addlAttribute("empCount", empCount);
LOGGER.info(request.getRequestURL().toString());
if(request.getRequestUrl().toString().contains("test7"))
{
	
	model.addAttribute("testSerial", "test7");

}
else
{
	model.addAttribute("testSerial", "test8");
}
	
	return "requestMappingAndResults2";
	
}









}

