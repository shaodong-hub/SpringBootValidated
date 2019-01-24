package com.github.validated.annotation.handler;

import com.github.validated.annotation.Dynamic;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

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


public class DynamicHandler implements ConstraintValidator<Dynamic, Set<String>> {

    /**
     * 得用线程安全的容器,当对容器中元素进行遍历同时增加数据时会抛出 fail-fast 错误
     */
    private volatile static CopyOnWriteArraySet<String> dynamicSet;

    @Override
    public boolean isValid(Set<String> set, ConstraintValidatorContext constraintValidatorContext) {
        return dynamicSet.containsAll(set);
    }

    @Override
    public void initialize(Dynamic constraintAnnotation) {
        // nothing to do
    }

    public static void setSet(CopyOnWriteArraySet<String> set) {
        DynamicHandler.dynamicSet = set;
    }
}
