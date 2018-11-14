package com.example.wht.common.controller;

import com.example.wht.common.security.SessionInterceptor;
import com.example.wht.user.pojo.User;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-16:07
 * @description
 */
public class BaseController {
    @ModelAttribute
    public final void init(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = (User) request.getSession().getAttribute(SessionInterceptor.SESSION_KEY);
        if(user == null) {
            response.sendRedirect(request.getContextPath() + "/login/tologin"); // 跳到登录页面
            return;
        }
    }
}
