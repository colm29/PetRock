package com.practice;

public class PetRock {
    public boolean isHappy = false;
    private String name;

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playWithRock() {
        isHappy = true;
    }
}


