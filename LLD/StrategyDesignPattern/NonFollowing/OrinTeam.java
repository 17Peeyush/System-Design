package StrategyDesignPattern.NonFollowing;

public class OrinTeam {
    
    public void selectPlayerAttack(String player){
        if(player.equals("Trickster")){
            System.out.println("Trickster enters the arena.");
            System.out.println("Trickster will tickle.");
        }
        else if(player.equals("Dancer")){
            System.out.println("Dancer enters the arena.");
            System.out.println("Dancer will dance and kick.");
        }
        else if(player.equals("Orin")){
            System.out.println("Orin enters the arena.");
            System.out.println("Orin will handle easily.");
        }
        else if(player.equals("Hero")){
            System.out.println("Hero enters the arena.");
            System.out.println("Hero will demonstrate strength");
        }
    }
}
