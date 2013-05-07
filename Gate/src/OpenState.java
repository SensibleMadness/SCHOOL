


public class OpenState implements State{
    public void performAction( TurnGate context ){
        context.setState( new OpenState() );
    }

    public void printActionName(){
       System.out.println("Ava");
    }

}
