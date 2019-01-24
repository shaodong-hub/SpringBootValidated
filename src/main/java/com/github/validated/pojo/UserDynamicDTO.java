package com.github.validated.pojo;

import com.github.validated.annotation.Dynamic;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * <p>
 * 创建时间为 上午11:05-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Data
public class UserDynamicDTO {

    @NotBlank
    private String name;

    @NotNull
    @Dynamic
    private Set<String> books;

}
