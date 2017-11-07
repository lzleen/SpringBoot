package com.lzl.service.customer;
/*
 * 作者：Mumu
 */
public class CustomerServiceImpl implements CustomerService{
  @Override
  public String getName() {
    System.out.print("小明去洗澡");
    return "妈妈说，小明是个小屁孩";
  }
}