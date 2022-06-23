package com.roomwits.examples.springbootinaction.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
public class MessageController {
    @GetMapping("/")
    public String home() {
        return "www.roomwits.com";
    }

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable("message") String msg) {
        return "[Echo]:" + msg;
    }

    @GetMapping("/object")
    public Object object() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getResponse();
        HashMap<String, String> map = new HashMap<>();
        map.put("Client IP:", request.getRemoteAddr());
        map.put("Client encoding", response.getCharacterEncoding());
        map.put("SessionID", request.getSession().getId());
        map.put("Project real path", request.getServletContext().getRealPath("/"));
        return map;
    }
}
