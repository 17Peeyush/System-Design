package StrategyDesignPattern.NonFollowing;

public class Duels {
    
    public static void main(String args[]){
        OrinTeam ot = new OrinTeam();

        //Match 1: The Brute vs The Trickster
        System.out.println("The Brute enters the arena.");
        ot.selectPlayerAttack("Hero");

        //Match 2: The Shadow vs The Dancer
        System.out.println("The shadow enters the arena.");
        ot.selectPlayerAttack("Dancer");

        //Match 3: Orin vs Borin
        System.out.println("Borin enters the arena.");
        ot.selectPlayerAttack("Orin");

    }
}
