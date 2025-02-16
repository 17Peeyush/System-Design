package StrategyDesignPattern.Following;

public class OrinTeam {
    
    private Player player;

    public void setPlayer(Player player){
        this.player = player;
    }

    public void attack(){
        player.attack();
    }
}