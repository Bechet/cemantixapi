package com.noidea.cemantixapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class CemantixController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getAnOk() {
        return "ok";
    }
}
