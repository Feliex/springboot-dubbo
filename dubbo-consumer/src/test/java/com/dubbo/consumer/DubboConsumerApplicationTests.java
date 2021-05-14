package com.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.bean.SubDemoBean;
import com.dubbo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {

    @Reference
    private HelloService helloService;

    @Test
    public void testValueMiss() {
        SubDemoBean subDemoBean = new SubDemoBean();
        subDemoBean.setId("8");
        subDemoBean.setIsDel("yes");
        System.out.println("provider >> subDemoBean: id=" + subDemoBean.getId() + ",isDel=" + subDemoBean.getIsDel());
        helloService.testValueMiss(subDemoBean);
    }

}
