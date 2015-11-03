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
public interface Engine {
    public int getSize();
    public boolean isTurbo();
    

    //------> Bridge
    public void start();
    public void stop();
    public void incresePower();
    public void decreasePower();   
}
