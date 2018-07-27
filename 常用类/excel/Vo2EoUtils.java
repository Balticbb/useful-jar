package com.u2licai.cms.common;

import org.springframework.beans.BeanUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: u2licai
 * @Package: com.u2licai.cms.common
 * @Description:
 * @author: jack liujialin@jinhuhang.com.cn
 * @date: 2018/7/6 13:19
 * @version: V1.0
 */
public class Vo2EoUtils<T,Z> {

  /**
   *
   * @param source 源对象
   * @param clazz 目标对象
   * @param <T> 目标对象类型
   * @param <Z> 源对象类型
   * @return
   * @throws IllegalAccessException
   * @throws InstantiationException
   */
    public static <T,Z> List<T> translate(List<Z> source,Class<T> clazz) throws IllegalAccessException, InstantiationException {

    List<T> target = new LinkedList<>();
    for (int i = 0; i < source.size(); i++) {
      T t= clazz.newInstance();
      BeanUtils.copyProperties(source.get(i),t);
      target.add(t);
    }

    return target;

  }
}
