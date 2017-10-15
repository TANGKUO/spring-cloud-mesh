package io.openfoundation.spring.cloud.mesh;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@ConditionalOnProperty(value = "spring.cloud.mesh.enabled", matchIfMissing = true)
public @interface ConditionalOnLinkerdEnabled {

}
