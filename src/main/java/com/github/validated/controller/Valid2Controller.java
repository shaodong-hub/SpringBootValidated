package com.github.validated.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

/**
 *
 * 注解必须写在这里,参数校验不过会有 ConstraintViolationException 异常
 *
 * <p>
 * 创建时间为 上午11:12-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Validated
@RestController
public class Valid2Controller {

    @GetMapping("valid4/{data}")
    public String getPathVariable(@Size(min = 3, max = 6) @PathVariable String data) {
        return data;
    }

    @GetMapping("valid4")
    public String getRequestParam(@Size(min = 3, max = 6) @RequestParam(value = "name", defaultValue = "0") String name) {
        return name;
    }

}