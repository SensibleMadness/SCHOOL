import java.util.Observable;


public class TurnGate extends Observable{

    private State state;

    public TurnGate( State state ){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void setState( State state ){
        this.state = state;
        // mark observable as changed
        setChanged();
    }

    public void performAction(){
        state.performAction(this);
        state.printActionName();
    }
}
