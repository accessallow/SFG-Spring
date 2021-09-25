package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("LifeCycleDemoBean : Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName = "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory = "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void beforeInit() {
        System.out.println("Before Init Call");
    }

    public void afterInit(){
        System.out.println("After Init Call");
    }
}
