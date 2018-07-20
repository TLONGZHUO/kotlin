package com.francis.service

import org.springframework.stereotype.Service

@Service
class LoginService{
    /**
     * 登录
     */
    fun login(var1: String): String {
        return if (var1 == "user") "success" else "fail"
    }

}

