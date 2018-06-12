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
public class AsyncDemoConsumer {

    @Reference(version = "1.0.0", async = true)
    private DemoRmiService asyncDemoRmiService;

    public void executeRmiApi(){
        log.info("消费者开始异步调用远程方法...");
        asyncDemoRmiService.asyncHello();
        log.info("消费者结束异步调用远程方法...");
    }
}
