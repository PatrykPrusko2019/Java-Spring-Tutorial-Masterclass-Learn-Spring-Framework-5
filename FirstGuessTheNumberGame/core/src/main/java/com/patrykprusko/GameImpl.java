package com.patrykprusko;

public class GameImpl implements Game{

    //fields
    private NumberGenerator numberGenerator;
    private int guessCount;
    private int number;
    private int smallest;
    private int biggest;
    private int remainingGuesses;



    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getGuess() {
        return 0;
    }

    @Override
    public void setGuess(int i) {
    }

    @Override
    public int getSmallest() {
        return smallest;
    }

    @Override
    public int getBiggest() {
        return 0;
    }

    @Override
    public int getRemainingGuesses() {
        return this.remainingGuesses;
    }

    @Override
    public void reset() {

    }

    @Override
    public void check() {

    }

    @Override
    public boolean isValidNumberRange() {
        return false;
    }

    @Override
    public boolean isGameWon() {
        return false;
    }

    @Override
    public boolean isGameLost() {
        return false;
    }
}
