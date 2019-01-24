package com.github.validated.pojo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

/**
 * <p>
 * 创建时间为 下午12:43-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
public class UserUrlDTO {

    @URL
    private String url;

}
