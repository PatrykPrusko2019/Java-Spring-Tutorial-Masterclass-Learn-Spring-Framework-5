package com.patrykprusko.console;

import com.patrykprusko.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  Game -> guess what the number is from 1-100
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(GameConfig.class);

        // close context (container)
        context.close();
    }
}
