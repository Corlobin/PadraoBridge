/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.padraobridge.cdp;

/**
 *
 * @author 20122bsi0387
 */
public abstract class AbstractDriverControls {
    public Engine engine;

    public AbstractDriverControls(Engine engine) {
        this.engine = engine;
    }
    public void inigitionOn(){
        engine.start();
    }
    public void inigitionOff() {
        engine.stop();        
    }
    public void accelerate() {
        engine.incresePower();
    }
    public void brake() {
        engine.decreasePower();
    }
    
}
