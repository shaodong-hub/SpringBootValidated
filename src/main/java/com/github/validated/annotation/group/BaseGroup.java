package com.github.validated.annotation.group;

import javax.validation.GroupSequence;

/**
 *
 * 分组序列先AAAA再BBBB
 *
 * <p>
 * 创建时间为 上午11:09-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@GroupSequence({BaseA.class, BaseB.class})
public interface BaseGroup {

}
