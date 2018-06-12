package jx.sun.springboot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import jx.sun.springboot.dubbo.rmi.DemoRmiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by sunjx on 2018/6/12.
 */
@Slf4j
@Component
@Service(interfaceClass = DemoRmiService.class, version = "1.0.0")
public class DemoRmiServiceImpl implements DemoRmiService{

    @Override
    public void hello() {
        log.info("hello调用开始...");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }
        log.info("hello调用结束...");
    }

    @Override
    public void asyncHello() {
        log.info("asyncHello调用开始...");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }
        log.info("asyncHello调用结束...");
    }


}
