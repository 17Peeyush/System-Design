package Following;

public class Air implements State {
    
    MagicalWand magicalWand;
    
    public Air(MagicalWand magicalWand){
        this.magicalWand = magicalWand;
    }

    public void selectMagic(State magicType){
        System.out.println("Can't change state from AIR state.");
    }

    public void castMagic(){
        System.out.println("Air Ball!! Tornado");
    }
    public void reset(){
        magicalWand.setState(magicalWand.getIdlState());
    }
    public void currentState(){
        System.out.println("In AIR state.");
    }
}