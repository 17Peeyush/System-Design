package Following;

public interface State {
    void selectMagic(State magicType);
    void castMagic();
    void reset();
    void currentState();
}
