package com.xc.mail.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * on 2019/11/28 10:36
 *  定时任务
 * @author zhuweitao
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

    /**
     * 每5秒打印一次
     */
    @Scheduled(cron = "0/5 * * * * ?") // 每20秒执行一次
    public void scheduler() {

        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");

    }
}
