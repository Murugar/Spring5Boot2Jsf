package com.iqmsoft.boot.jsf.scope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationScopeMetadataResolver;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;
import org.springframework.context.annotation.ScopedProxyMode;


public class SessionRepAwareScopeMetadata extends AnnotationScopeMetadataResolver implements ScopeMetadataResolver {

    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
        ScopeMetadata scopeMetadata = super.resolveScopeMetadata(definition);
        final String scopeName = scopeMetadata.getScopeName();
        if (scopeName.equals(ScopeName.SESSION) || scopeName.equals(ScopeName.VIEW)) {
            scopeMetadata.setScopedProxyMode(ScopedProxyMode.TARGET_CLASS);
        }
        return scopeMetadata;
    }
}

