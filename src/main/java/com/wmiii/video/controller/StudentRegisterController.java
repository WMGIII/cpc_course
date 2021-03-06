package com.wmiii.video.controller;

import com.wmiii.video.params.LoginParam;
import com.wmiii.video.params.Result;
import com.wmiii.video.service.StudentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student_register")
public class StudentRegisterController {

    @Autowired
    private StudentLoginService studentLoginService;

    @PostMapping
    public Result studentRegister(@RequestBody LoginParam loginParam) {
        System.out.println("学生注册");
        return studentLoginService.register(loginParam);
    }
}
