package com.example.wht.common.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-16:09
 * @description
 */
public class SessionInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 登录session key
     */
    public final static String SESSION_KEY = "USER";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        if(session == null || session.getAttribute(SESSION_KEY) == null){
            if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
                logger.info("-----ajax------");
                //如果是ajax请求响应头会有，x-requested-with
                response.setHeader("sessionstatus", "timeout");//在响应头设置session状态
                return false;
            }else{
                response.sendRedirect("/login/tologin");
                return false;
            }
        }else{
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
