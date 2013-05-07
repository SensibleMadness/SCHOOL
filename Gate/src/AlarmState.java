public class AlarmState implements State{

    public void performAction( TurnGate context ){
        context.setState( new AlarmState() );
        context.notifyObservers();
    }

    public void printActionName(){
        System.out.println("Alarm");
    }
}