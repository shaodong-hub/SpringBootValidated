package com.github.validated.annotation;

import com.github.validated.annotation.handler.BuiltHandler;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = BuiltHandler.class)
public @interface Built {

    String[] value();

    String message() default "AnnoValidator 不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
