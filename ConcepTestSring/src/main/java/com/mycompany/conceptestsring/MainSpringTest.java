/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptestsring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Israel
 */
public class MainSpringTest {

    public static void main(String[] arg) {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/mycompany/resources/contexApp.xml");
        MessageI msg = (MessageI) ctx.getBean("bean2");
        System.out.println("Message =>" + msg.helloSpring());
    }

}
