package com.staticfactory.method.test;

import com.staticfactory.method.beans.Appointment;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class STFTest {

    public static void main(String[] args) {
        // TODO here i m using spring 5
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/staticfactory/application-context.xml"));
        Appointment appointment = beanFactory.getBean("appointment", Appointment.class);
        System.out.println(appointment);


        // TODO using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("com/staticfactory/application-context.xml");
        Appointment appointment1 = context.getBean("appointment", Appointment.class);
        System.out.println(appointment1);

        // TODO spring 6
        BeanFactory beanFactory1 = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory1);
        // load objects to the IOC container
        reader.loadBeanDefinitions(new ClassPathResource("com/staticfactory/application-context.xml"));
        Appointment appointment2 = beanFactory1.getBean("appointment", Appointment.class);
        System.out.println(appointment2);
    }
}
