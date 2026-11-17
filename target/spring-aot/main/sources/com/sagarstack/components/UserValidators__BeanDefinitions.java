package com.sagarstack.components;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UserValidators}.
 */
@Generated
public class UserValidators__BeanDefinitions {
  /**
   * Get the bean definition for 'userValidators'.
   */
  public static BeanDefinition getUserValidatorsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UserValidators.class);
    beanDefinition.setInstanceSupplier(UserValidators::new);
    return beanDefinition;
  }
}
