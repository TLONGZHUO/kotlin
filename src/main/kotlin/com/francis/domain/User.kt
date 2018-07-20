package com.francis.domain

import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*

@Entity
@Table(name = "tlong_user")
@DynamicUpdate
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null

    //账户
    private var userName: String? = null

    //密码
    private var password: String? = null

}