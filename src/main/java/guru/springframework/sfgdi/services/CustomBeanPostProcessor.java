package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessBeforeInitialization: Bean = "+bean+" & beanName="+beanName);
//        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);

        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).beforeInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessAfterInitialization: Bean = "+bean+" & beanName="+beanName);
//        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);

        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
