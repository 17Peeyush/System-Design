package Following;

public class MagicalWand {
    
    State Idle;
    State Fire;
    State Water;
    State Air;
    State Thunder;

    State state; // store the current state
    boolean waterMagic; //
    public MagicalWand(){
        Idle = new Idle(this);
        Fire = new Fire(this);
        Water = new Water(this);
        Air = new Air(this);
        Thunder = new Thunder(this);
        state = Idle;
        waterMagic = false;
    }

    // implement getters for states

    public State getIdlState(){
        return this.Idle;
    }

    public State getFireState(){
        return this.Fire;
    }

    public State getWaterState(){
        return this.Water;
    }

    public State getAirState(){
        return this.Air;
    }
    public State getThunderState(){
        return this.Thunder;
    }

    // setter
    public void setState(State newState){
        this.state = newState;
    }

    public void selectMagic(State input){
        state.selectMagic(input);
    }

    public void castMagic(){
        state.castMagic();
    }

    public void reset(){
        state.reset();
    }

    public void currentState(){
        state.currentState();
    }
}
