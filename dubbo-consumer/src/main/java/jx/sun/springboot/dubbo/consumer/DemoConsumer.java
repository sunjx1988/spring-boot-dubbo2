package jx.sun.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import jx.sun.springboot.dubbo.rmi.DemoRmiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by sunjx on 2018/6/12.
 */
@Slf4j
@Service
public class DemoConsumer {

    @Reference(version = "1.0.0", async = false, timeout = 10000)
    private DemoRmiService demoRmiService;

    public void executeRmiApi(){
        log.info("消费者开始同步调用远程方法...");
        demoRmiService.hello();
        log.info("消费者结束同步调用远程方法...");
    }
}
