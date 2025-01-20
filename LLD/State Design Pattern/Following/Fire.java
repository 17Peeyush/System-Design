package Following;

public class Fire implements State {
    MagicalWand magicalWand;

    public Fire(MagicalWand magicalWand){
        this.magicalWand = magicalWand;
    }

    public void selectMagic(State magicType){
        System.out.println("Can't change state from FIRE state.");
    }

    public void castMagic(){
        System.out.println("Fire Ball!!");
        magicalWand.setState(magicalWand.getWaterState()); // state change due to cooldown
    }
    public void reset(){
        magicalWand.setState(magicalWand.getIdlState());
    }
    public void currentState(){
        System.out.println("In FIRE state.");
    }
}