package com.patrykprusko.console;

import com.patrykprusko.Game;
import com.patrykprusko.MessageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class ConsoleNumberGuess {

    public static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    private final Game game;
    private final MessageGenerator messageGenetator;


    public ConsoleNumberGuess(Game game, MessageGenerator messageGenetator) {
        this.game = game;
        this.messageGenetator = messageGenetator;
    }

    // events
    @EventListener(ContextRefreshedEvent.class)
    public void startGame() {

        System.out.println("hello start game :");


    }
}
