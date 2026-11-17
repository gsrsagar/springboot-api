package com.sagarstack.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UserService1}.
 */
@Generated
public class UserService1__BeanDefinitions {
  /**
   * Get the bean definition for 'userService1'.
   */
  public static BeanDefinition getUserServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UserService1.class);
    beanDefinition.setInstanceSupplier(UserService1::new);
    return beanDefinition;
  }
}
