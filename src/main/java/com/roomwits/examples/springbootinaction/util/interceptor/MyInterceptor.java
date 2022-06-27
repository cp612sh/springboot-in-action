package com.roomwits.examples.springbootinaction.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
    private Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        log.info("afterCompletion: {}",
                handlerMethod.getMethod().getName());
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        log.info("postHandle: {}",
                handlerMethod.getMethod().getName());
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        log.info("preHandle: {}",
                handlerMethod.getMethod().getName());
        return true;
    }

}
