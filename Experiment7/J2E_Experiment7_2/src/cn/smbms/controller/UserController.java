package cn.smbms.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import cn.smbms.tools.Constants;

@Controller
@RequestMapping("/user")
public class UserController{
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/login.html")
	public String login(){
		logger.debug("UserController welcome SMBMS==================");
		return "login";
	}
	
	@RequestMapping(value="/dologin.html",method=RequestMethod.POST)
	public String doLogin(@RequestParam String userCode,@RequestParam String userPassword,HttpServletRequest request,HttpSession session){
		logger.debug("doLogin====================================");
		//����service�����������û�ƥ��
		User user = userService.login(userCode,userPassword);
		if(null == user){
			throw new RuntimeException("�û��������ڣ�");
			//request.setAttribute("error", "�û�������ȷ");
			//return "login";
		}else if(null != user && !user.getUserPassword().equals(userPassword)){
			//ҳ����ת��login.jsp��������ʾ��Ϣ--ת��
			throw new RuntimeException("�����������");
			//request.setAttribute("error", "���벻��ȷ");
			//return "login";
		}
		//����session
		session.setAttribute(Constants.USER_SESSION, user);
		//ҳ����ת
		return "redirect:/user/main.html";
	}
	
	@RequestMapping(value="/main.html")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.USER_SESSION) == null){
			return "redirect:/user/login.html";
		}
		return "frame";
	}
	
	@RequestMapping(value="/logout.html")
	public String logout(HttpSession session){
		//���session
		session.removeAttribute(Constants.USER_SESSION);
		return "login";
	}
	
	@ExceptionHandler(value={RuntimeException.class})
	public String handlerException(RuntimeException e,HttpServletRequest req){
		req.setAttribute("e", e);
		return "login";
	}
	
}
