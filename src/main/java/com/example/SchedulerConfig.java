package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduled.enabled", matchIfMissing = true)
public class SchedulerConfig {
}
