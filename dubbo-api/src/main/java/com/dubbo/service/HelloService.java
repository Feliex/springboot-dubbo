package com.dubbo.service;

import com.dubbo.bean.SubDemoBean;

public interface HelloService {

    public String sayHello(String name);

    public void testValueMiss(SubDemoBean subDemoBean);
}
