package StrategyDesignPattern.Following;

public class Trickster implements Player{

    public Trickster(){
        System.out.println("Trickster enters the arena.");
    }

    public void attack(){
        System.out.println("Trickster will tickle.");
    }
}