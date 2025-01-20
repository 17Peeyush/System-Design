
public class MagicalWand{

    final static int IDLE=0;
    final static int FIRE=1;
    final static int WATER=2;
    final static int AIR=3;

    int state;
    
    public MagicalWand(){
        state =0;
    }

    public void selectMagic(int magicType){
        if(state == IDLE){
            if(magicType==FIRE){
                state = FIRE;
                System.out.println("Transition to FIRE state.");
            }
            else if(magicType == WATER){
                state = WATER;
                System.out.println("Transition to WATER state.");
            }
            else if(magicType == AIR){
                state = AIR;
                System.out.println("Transition to AIR state");
            }
            else{
                System.err.println("Can't perform this kind of magic.");
            }
        }
        else if(state == FIRE){
            System.err.println("Can't change state from FIRE state.");
        }
        else if(state == WATER){
            System.out.println("Can't change state from WATER state.");
        }
        else if(state == AIR){
            System.out.println("Can't change state from AIR state.");
        }
        else {
            System.out.println("In invalid state.");
        }
    }

    public void castMagic(){
        if(state == IDLE){
            System.out.println("Not elemental state!! Can't cast magic");
        }
        else if(state == FIRE){
            System.out.println("Fire Ball!!");
            state = WATER;
        }
        else if(state == WATER){
            System.out.println("Water Ball !!");
        }
        else if(state == AIR){
            System.out.println("Air Ball !! Tornado");
        }
        else{
            System.out.println("invalid state.");
        }

    }

    public void reset(){
        if(state == IDLE){
            System.out.println("Already in IDLE state.");
        }
        else if(state == FIRE){
            state=IDLE;
            System.out.println("FIRE -> IDLE ");
        }
        else if(state == WATER){
            state = IDLE;
            System.out.println("WATER -> IDLE");
        }
        else if(state == AIR){
            state = IDLE;
            System.out.println("AIR -> IDLE");
        }
        else{
            System.out.println("Invalid state");
        }
    }

    public void currentState(){
        System.out.println("State: "+ state);
    }

}