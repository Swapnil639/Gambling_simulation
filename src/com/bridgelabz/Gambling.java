package com.bridgelabz;

public class Gambling {
    static int STAKE_AMOUNT = 100;
    static int BET = 1;
    static int gameAmount = (int) (Math.floor(Math.random() * 10) % 2);
    static int winning=0;

    static void check() {
        for (int day = 1; day <=20; day++) {
            while (STAKE_AMOUNT > 50 && STAKE_AMOUNT < 150) {
                if (BET == gameAmount) {
                    System.out.println("Gambler win the game");
                    STAKE_AMOUNT +=BET;

                } else {
                    System.out.println("Gambler loose the game");
                    STAKE_AMOUNT-=BET;
                }

            }
            if(STAKE_AMOUNT==150){
                System.out.println("Player has won gambler for day " +day);
                winning +=50;

            }else {
                System.out.println("Player has loose gambler for day " +day);
                winning -=50;
            }
            System.out.println(winning);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Problem");
        System.out.println(gameAmount);
        check();
    }
}
