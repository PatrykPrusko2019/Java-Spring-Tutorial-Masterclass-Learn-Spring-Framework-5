package com.patrykprusko.config;

import com.patrykprusko.GuestCount;
import com.patrykprusko.MaxNumber;
import com.patrykprusko.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.patrykprusko")
public class GameConfig {



    private int maxNumber;

    private int guessCount;

    private int minNumber;

    @Bean
    @GuestCount
    public int guessCount() {
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }





}
