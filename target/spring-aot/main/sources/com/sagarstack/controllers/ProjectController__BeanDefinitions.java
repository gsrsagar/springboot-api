package com.sagarstack.controllers;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProjectController}.
 */
@Generated
public class ProjectController__BeanDefinitions {
  /**
   * Get the bean definition for 'projectController'.
   */
  public static BeanDefinition getProjectControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ProjectController.class);
    beanDefinition.setInstanceSupplier(ProjectController::new);
    return beanDefinition;
  }
}
