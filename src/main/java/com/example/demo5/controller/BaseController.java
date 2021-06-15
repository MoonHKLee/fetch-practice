package com.example.demo5.controller;

import com.example.demo5.dto.RegisterRequest;
import com.example.demo5.dto.ResponseEnvelop;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }

    @ResponseBody
    @PostMapping(path = "/submit")
    protected ResponseEntity<ResponseEnvelop> submit(
        @RequestBody RegisterRequest requestDTO
    ) {
        System.out.println(requestDTO.getTitle());
        System.out.println(requestDTO.getContent());
        ResponseEnvelop res = new ResponseEnvelop("success","success");
        return ResponseEntity.ok().body(res);
    }
}
