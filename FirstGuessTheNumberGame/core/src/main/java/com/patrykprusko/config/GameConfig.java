package com.patrykprusko.config;

import com.patrykprusko.GuessCount;
import com.patrykprusko.MaxNumber;
import com.patrykprusko.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.patrykprusko")
public class GameConfig {

    //  fields
    @Value("${game.maxNumber:100}")
    private int maxNumber;

    @Value("${game.guessCount:10}")
    private int guessCount;

    @Value("${game.minNumber:1}")
    private int minNumber;


    //  bean methods
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }
}
