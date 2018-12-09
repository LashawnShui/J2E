package cn.smbms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//控制器:IndexController
public class IndexController extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("学框架就学Spring MVC!");
		return new ModelAndView("index");
	}

	
	 
}
