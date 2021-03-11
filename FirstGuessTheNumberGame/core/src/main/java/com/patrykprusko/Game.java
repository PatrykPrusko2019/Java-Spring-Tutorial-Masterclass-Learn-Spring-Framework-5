package com.patrykprusko;

public interface Game {
    int getNumber();

    int getGuess();

    void setGuess(int i);

    int getSmallest();

    int getBiggest();

    int getRemainingGuesses();

    void reset();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

    boolean isGameLost();
}
