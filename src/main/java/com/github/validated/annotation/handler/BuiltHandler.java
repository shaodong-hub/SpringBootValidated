package com.github.validated.annotation.handler;

import com.github.validated.annotation.Built;
import com.google.common.collect.Sets;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Set;

/**
 * <p>
 * 创建时间为 下午12:52-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


public class BuiltHandler implements ConstraintValidator<Built, String> {

    private Set<String> values;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return values.contains(value);
    }

    @Override
    public void initialize(Built built) {
        this.values = Sets.newHashSet(built.value());
    }
}
