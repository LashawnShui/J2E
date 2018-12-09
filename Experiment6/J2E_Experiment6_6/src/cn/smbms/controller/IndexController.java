package cn.smbms.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController{
	
	private Logger logger = Logger.getLogger(IndexController.class);
	
	@RequestMapping("/index.html")
	public String index(){
		logger.info("hello,SpringMVC!");
		return "index";
	}

	@RequestMapping("/test.html")
	public String save(String userCode,Model model){
		logger.info("hello,SpringMVC! userCode: " + userCode);
		model.addAttribute("userCode", userCode);
		return "success";
	}

	
	 
}
