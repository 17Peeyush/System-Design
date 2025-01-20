package Following;

public class Thunder implements State {
    
    MagicalWand magicalWand;
    
    public Thunder(MagicalWand magicalWand){
        this.magicalWand = magicalWand;
    }

    public void selectMagic(State magicType){
        System.out.println("Can't change state from THUNDER state.");
    }

    public void castMagic(){
        if(magicalWand.waterMagic){
            System.out.println("Can't perform magic Safety mechanism");
            magicalWand.setState(magicalWand.getIdlState()); // safety mechanism
        }
        else{
            System.out.println("Thunder strike!!");
        }
    }
    public void reset(){
        magicalWand.setState(magicalWand.getIdlState());
    }
    public void currentState(){
        System.out.println("In THUNDER state.");;
    }
}