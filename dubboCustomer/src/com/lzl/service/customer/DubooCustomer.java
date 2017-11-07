package com.lzl.service.customer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 浣滆�咃細Mumu
 */
public class DubooCustomer {
  public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[]{"applicationConsumer.xml"});  

      CustomerService demoService = (CustomerService) context.getBean("demoService"); // get  
      System.out.println(demoService.getName());
      // service  
      // proxy  
        try {
      System.in.read();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }  
  }
}