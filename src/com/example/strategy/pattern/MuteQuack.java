package com.example.strategy.pattern;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence!!");
    }
}
