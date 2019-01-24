package com.github.validated.controller;

import com.github.validated.pojo.UserDynamicDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
public class Valid3Controller {

    @PostMapping("valid5")
    public UserDynamicDTO getPathVariable(@RequestBody @Valid UserDynamicDTO user) {
        return user;
    }



}
