package StrategyDesignPattern.Following;

public class Dancer implements Player{

    public Dancer(){
        System.out.println("Dancer enters the arena.");
    }

    public void attack(){
        System.out.println("Dancer will dance and kick.");
    }
}