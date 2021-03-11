package com.patrykprusko;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator{
    private Random random;
    private int maxNumber;

    @Override
    public int next() {
        return random.nextInt(100) + 1;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
