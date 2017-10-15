package io.openfoundation.spring.cloud.mesh;

import feign.Client;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MeshPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {

        if (name.equals("feignClient")) {
            if (bean instanceof Client) {
                Client linkerdClient = new MeshFeignClient((Client)bean);
                return linkerdClient;
            }
        }

        return bean;
    }
}
