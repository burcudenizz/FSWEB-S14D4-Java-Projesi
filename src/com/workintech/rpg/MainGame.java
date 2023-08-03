package com.workintech.rpg;

public class MainGame {

    public static void main(String[] args) {


        Monster troll = new Troll("x",1000,100);
        troll.poison();
        System.out.println(troll.attack());
    }
}
