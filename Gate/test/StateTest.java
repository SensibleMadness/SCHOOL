import org.junit.Test;

public class StateTest{

    @Test
    public void testDifferentStates() {
        System.out.println("_____________________");
        System.out.println("testDifferentStates()");
        System.out.println();

        TurnGate ctx = new TurnGate( new OpenState() );
        ctx.performAction();

        ctx.setState( new ClosedState() );
        ctx.performAction();

        ctx.setState( new ThankfulState() );
        ctx.performAction();

        ctx.setState( new AlarmState() );
        ctx.performAction();
    }

    @Test
    public void testAlarmObserver() {
        System.out.println("___________________");
        System.out.println("testAlarmObserver()");
        System.out.println();

        TurnGate ctx = new TurnGate( new OpenState() );
        GateObserver observer = new GateObserver();

        ctx.addObserver( observer );

        ctx.performAction();

        ctx.setState( new AlarmState() );
        ctx.performAction();

        ctx.setState( new ClosedState() );
        ctx.performAction();

    }

}
