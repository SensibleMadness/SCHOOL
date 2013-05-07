import java.util.Observable;
import java.util.Observer;


public class GateObserver implements Observer{

    public void update( Observable o, Object arg ){
        System.out.println("Värav sattus alarmi olekusse. Vaatleja sai sõnumi kätte.");
    }

}
