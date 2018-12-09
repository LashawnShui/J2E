package cn.smbms.test.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;

public class UserTestServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(UserTestServlet.class);
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        List<User> userList = new ArrayList<User>();
        User userCondition = new User();
        userCondition.setUserName("赵");
        userCondition.setUserRole(3);
        userList = userService.findUsersWithConditions(userCondition);

        for (User userResult : userList) {
            logger.debug("testGetUserList userCode: "
                    + userResult.getUserCode() + " and userName: "
                    + userResult.getUserName() + " and userRole: "
                    + userResult.getUserRole() + " and userRoleName: "
                    + userResult.getUserRoleName() + " and address: "
                    + userResult.getAddress());
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        this.doGet(request, response);
    }

}
