package com.sagarstack.APi_Project;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link APiProjectApplication}.
 */
@Generated
public class APiProjectApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'aPiProjectApplication'.
   */
  public static BeanDefinition getAPiProjectApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(APiProjectApplication.class);
    beanDefinition.setInstanceSupplier(APiProjectApplication::new);
    return beanDefinition;
  }
}
