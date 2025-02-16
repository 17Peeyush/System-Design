package StrategyDesignPattern.Following;

public class Hero implements Player{

    public Hero(){
        System.out.println("Hero enters the arena.");
    }

    public void attack(){
        System.out.println("Hero will demonstrate strength.");
    }
}