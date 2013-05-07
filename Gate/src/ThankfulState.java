public class ThankfulState implements State{

    public void performAction( TurnGate context ){
        context.setState( new ThankfulState() );
    }

    public void printActionName(){
       System.out.println("Täna");
    }
}