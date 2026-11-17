package com.sagarstack.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CoursesController}.
 */
@Generated
public class CoursesController__BeanDefinitions {
  /**
   * Get the bean definition for 'coursesController'.
   */
  public static BeanDefinition getCoursesControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CoursesController.class);
    beanDefinition.setInstanceSupplier(CoursesController::new);
    return beanDefinition;
  }
}
