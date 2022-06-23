package com.roomwits.examples.springbootinaction.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    public Object object(HttpServletRequest request, HttpServletResponse response){
        HashMap<String, String> map = new HashMap<>();
        map.put("Client IP:", request.getRemoteAddr());
        map.put("Client encoding", request.getCharacterEncoding());
        map.put("SessionID", request.getSession().getId());
        map.put("Project real path", request.getServletContext().getRealPath("/"));
        return map;
    }
}
