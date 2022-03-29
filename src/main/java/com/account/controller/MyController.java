package com.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.account.model.Message;

@Controller
public class MyController {

    @Autowired
    private Message message;

    @GetMapping(path = "/message")
    @ResponseBody
    public String message() {

        return message.get();
    }
}