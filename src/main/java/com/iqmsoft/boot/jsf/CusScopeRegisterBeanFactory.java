package com.iqmsoft.boot.jsf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.jsf.scope.ScopeName;
import com.iqmsoft.boot.jsf.scope.ViewScope;


@Component
public class CusScopeRegisterBeanFactory implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerScope(ScopeName.VIEW, new ViewScope());
    }
}
