package com.francis.controller

import com.francis.service.LoginService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class LoginController(val loginService: LoginService) {

    /**
     * 登录
     */
    @PostMapping("/login")
    fun login(@RequestParam var1: String): String {
        return loginService.login(var1)
    }

}