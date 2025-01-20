package Following;

public class MagicalWandTestDrive {
    public static void main(String[] args){
        MagicalWand magicalWand = new MagicalWand();

        magicalWand.currentState();
        magicalWand.castMagic();
        magicalWand.selectMagic(magicalWand.getFireState());
        magicalWand.castMagic();
        magicalWand.currentState();
        magicalWand.castMagic();
        magicalWand.reset();
        magicalWand.currentState();
        magicalWand.selectMagic(magicalWand.getAirState());
        magicalWand.castMagic();
        // new code
        magicalWand.reset();
        magicalWand.selectMagic(magicalWand.getThunderState());
        magicalWand.currentState();
        magicalWand.castMagic();
        magicalWand.currentState();
    }
}
