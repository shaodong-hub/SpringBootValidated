package com.github.validated.schedule;

import com.github.validated.annotation.handler.DynamicHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * <p>
 * 创建时间为 上午11:07-2019/1/24
 * 项目名称 SpringBootValidated
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Slf4j
@Component
@EnableScheduling
public class DynamicSchedule {


    @Scheduled(fixedDelay = 10000)
    public void autoSync() {
        CopyOnWriteArraySet<String> dynamicSet = new CopyOnWriteArraySet<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            dynamicSet.add(random.nextInt(10) + "");
        }
        DynamicHandler.setSet(dynamicSet);
        log.info(dynamicSet.toString());
    }

}
