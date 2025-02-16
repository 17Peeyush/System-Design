package StrategyDesignPattern.NonFollowing;

public class DataLandTeam extends OrinTeam {

    public DataLandTeam(){
        System.out.println("We represent Dataland.");
    }

    public static void main(String args[]){
        DataLandTeam dt = new DataLandTeam();
        System.out.println("First Match: ");
        dt.selectPlayerAttack("Orin");
    }
    
}
