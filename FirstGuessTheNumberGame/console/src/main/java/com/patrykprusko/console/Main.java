package com.patrykprusko.console;

import com.patrykprusko.NumberGeneratorImpl;
import com.patrykprusko.config.GameConfig;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * class main
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The number game");

        //create container
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);





        context.close();

    }
}
