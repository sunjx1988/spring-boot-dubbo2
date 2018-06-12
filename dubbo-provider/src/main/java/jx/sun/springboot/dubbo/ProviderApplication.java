package jx.sun.springboot.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

/**
 * Created by sunjx on 2018/6/12.
 */
@Slf4j
@SpringBootApplication
public class ProviderApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
        try {
            TimeUnit.MINUTES.sleep(60);
        } catch (InterruptedException e) {}
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("服务提供者启动...");
    }
}
