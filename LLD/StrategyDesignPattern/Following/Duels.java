package StrategyDesignPattern.Following;

public class Duels {
    
    public static void main(String args[]){
        OrinTeam ot = new OrinTeam();

        //Match 1: The Brute vs The Hero
        System.out.println("The Brute enters the arena.");
        ot.setPlayer(new Hero());
        ot.attack();

        //Match 2: The Shadow vs The Dancer
        System.out.println("The shadow enters the arena.");
        ot.setPlayer(new Dancer());
        ot.attack();

        //Match 3: Orin vs Borin
        System.out.println("Borin enters the arena.");
        ot.setPlayer(new Orin());
        ot.attack();

    }
}
