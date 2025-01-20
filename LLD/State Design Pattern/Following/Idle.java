package Following;

public class Idle implements State {
    
    MagicalWand magicalWand;

    public Idle(MagicalWand magicalWand){
        this.magicalWand = magicalWand;
    }

    public void selectMagic(State magicType){
        magicalWand.setState(magicType);
    }

    public void castMagic(){
        System.out.println("Not elemental state!! Can't cast magic");
    }
    public void reset(){
        System.out.println("Already in IDLE state.");
    }
    public void currentState(){
        System.out.println("In IDLE state");
    }
}
