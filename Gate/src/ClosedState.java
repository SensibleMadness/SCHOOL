public class ClosedState implements State{

    public void performAction( TurnGate context ){
        context.setState( new ClosedState() );
    }

    public void printActionName(){
        System.out.println("Sulge");
    }
}