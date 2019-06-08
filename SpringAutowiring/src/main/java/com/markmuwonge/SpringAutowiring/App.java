package com.markmuwonge.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Light light = context.getBean("lightObj", Light.class);
		light.flipSwitch();

    }
}
