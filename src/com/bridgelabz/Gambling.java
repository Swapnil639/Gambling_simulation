package com.bridgelabz;

public class Gambling {
    static int STAKE_AMOUNT = 100;
    static int BET = 1;
    static int gameAmount = (int) (Math.floor(Math.random() * 10) % 2);

    static void check() {
        while (STAKE_AMOUNT > 50 && STAKE_AMOUNT < 150) {
            if (BET == gameAmount) {
                System.out.println("Gambler win the game");
                STAKE_AMOUNT++;

            } else {
                System.out.println("Gambler loose the game");
                STAKE_AMOUNT--;
            }
            System.out.println(STAKE_AMOUNT);
        }
        if (STAKE_AMOUNT == 50 || STAKE_AMOUNT == 150) {
            System.out.println("Player would like to resign for current day !");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Problem");
        System.out.println(gameAmount);
        check();
    }
}
