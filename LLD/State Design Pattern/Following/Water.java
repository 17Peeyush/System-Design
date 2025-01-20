package Following;

public class Water implements State {
    
    MagicalWand magicalWand;
    
    public Water(MagicalWand magicalWand){
        this.magicalWand = magicalWand;
    }

    public void selectMagic(State magicType){
        System.out.println("Can't change state from WATER state.");
    }

    public void castMagic(){
        System.out.println("Water Ball!!");
        magicalWand.waterMagic = true;
    }
    public void reset(){
        magicalWand.setState(magicalWand.getIdlState());
    }
    public void currentState(){
        System.out.println("In WATER state.");
    }
}