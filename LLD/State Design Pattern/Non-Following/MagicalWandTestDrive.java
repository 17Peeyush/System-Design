public class MagicalWandTestDrive {
    
    public static void main(String[] args){
        MagicalWand magicalWand = new MagicalWand();

        magicalWand.currentState();
        magicalWand.castMagic();
        magicalWand.selectMagic(MagicalWand.FIRE);
        magicalWand.castMagic();
        magicalWand.currentState();
        magicalWand.castMagic();
        magicalWand.reset();
        magicalWand.currentState();
        magicalWand.selectMagic(MagicalWand.AIR);
        magicalWand.castMagic();
    }
}
