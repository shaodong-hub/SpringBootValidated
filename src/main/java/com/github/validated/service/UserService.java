package com.github.validated.service;

import com.github.validated.annotation.group.BaseB;
import com.github.validated.pojo.UserSimpleDTO;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

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


@Service
@Validated
public class UserService {

    public UserSimpleDTO valid(@Validated({BaseB.class}) UserSimpleDTO userSimpleDTO) {
        return userSimpleDTO;
    }

}
