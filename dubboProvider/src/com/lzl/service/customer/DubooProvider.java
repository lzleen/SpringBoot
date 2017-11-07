package com.lzl.service.customer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 作者：Mumu
 */
public class DubooProvider {
  public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationProvider.xml"});  
        context.start();  
        //System.out.println("Press any key to exit.");  
        System.out.println("完成");
        /*try {
            System.in.read();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }  */
  }
}