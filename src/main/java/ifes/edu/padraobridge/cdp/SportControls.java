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
public class SportControls extends AbstractDriverControls {

    public SportControls(Engine engine) {
        super(engine);
    }
    public void accelerateHard(){
        accelerate();
        accelerate();
    }
    
}
