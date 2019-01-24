package com.github.validated.pojo;

import com.github.validated.annotation.group.BaseB;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * <p>
 * 创建时间为 上午11:10-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Data
public class UserDTO {

    @NotEmpty
    private String id;

    @Size(min = 3, max = 8, message = "{user.name.notBlank}", groups = {BaseB.class})
    private String name;

    private Integer age;


}
