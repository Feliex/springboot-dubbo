package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.bean.SubDemoBean;
import com.dubbo.service.HelloService;
import org.springframework.stereotype.Component;

//dubbo注解，暴露服务
@Service
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }

    @Override
    public void testValueMiss(SubDemoBean subDemoBean) {
        System.out.println("provider >> subDemoBean: id=" + subDemoBean.getId() + ",isDel=" + subDemoBean.getIsDel());
    }
}
