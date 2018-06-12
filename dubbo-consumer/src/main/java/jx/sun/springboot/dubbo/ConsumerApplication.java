package jx.sun.springboot.dubbo;

import jx.sun.springboot.dubbo.consumer.AsyncDemoConsumer;
import jx.sun.springboot.dubbo.consumer.DemoConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by sunjx on 2018/6/12.
 */
@Slf4j
@SpringBootApplication
public class ConsumerApplication implements CommandLineRunner{

    @Autowired
    private AsyncDemoConsumer asyncDemoConsumer;

    @Autowired
    private DemoConsumer demoConsumer;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("服务消费者启动...");
//        asyncDemoConsumer.executeRmiApi();
        demoConsumer.executeRmiApi();
    }
}
