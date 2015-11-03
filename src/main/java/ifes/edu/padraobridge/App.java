package ifes.edu.padraobridge;

import ifes.edu.padraobridge.cdp.*;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new StandartEngine(1300);
        StandartControls controls1 = new StandartControls(engine);
        controls1.inigitionOn();
        controls1.accelerate();
        controls1.brake();
        controls1.inigitionOff();
        
        SportControls controls2 = new SportControls(engine);
        controls2.inigitionOn();
        controls2.accelerate();
        controls2.accelerateHard();
        controls2.brake();
        controls2.inigitionOff();
    }
}
