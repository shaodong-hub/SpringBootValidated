package com.github.validated.controller;

import com.github.validated.annotation.group.BaseB;
import com.github.validated.pojo.UserDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 上午11:12-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@RestController
public class Valid4Controller {

    @PostMapping("valid4")
    public UserDTO getPathVariable(@RequestBody @Validated({BaseB.class}) UserDTO user) {
        return user;
    }



}
