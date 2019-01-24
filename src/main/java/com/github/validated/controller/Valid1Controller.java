package com.github.validated.controller;

import com.github.validated.annotation.group.BaseA;
import com.github.validated.annotation.group.BaseB;
import com.github.validated.pojo.UserComplexDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 上午11:11-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@RestController
public class Valid1Controller {

    /**
     * {"name":"shao","pass":"333","salary":11,"range":6,"age":20,"email":"shaopro@qq.com","flag":true,"birthday":"2018-08-07T16:25:44.000+0000","expire":"2018-12-01T10:12:24.000+0000","url":"http://www.baidu.com","built":"1","list":[1,2]}
     *
     * @param user user
     * @return return
     */
    @PostMapping("valid1")
    public UserComplexDTO postUser1(@RequestBody @Valid UserComplexDTO user) {
        return user;
    }

    @PostMapping("valid2")
    public UserComplexDTO postGroup(@RequestBody @Validated({BaseB.class}) UserComplexDTO simpleUser) {
        return simpleUser;
    }

    @PutMapping("valid2")
    public UserComplexDTO putGroup(@RequestBody @Validated({BaseA.class}) UserComplexDTO simpleUser) {
        return simpleUser;
    }

}
