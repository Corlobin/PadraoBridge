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
public abstract class AbstractEngine implements Engine {
    private int size;
    private boolean turbo;
    
    private boolean running;
    private int power;

    public AbstractEngine(int size, boolean turbo) {
        this.size = size;
        this.turbo = turbo;
        // nova implementação
        running = false;
        power = 0;
    }

    public void start() {
        running = true;
        System.out.println("Engine started");
    }
    public void stop() {
        running = false;
        power = 0;
        System.out.println("Engine stopped");
        
    }
    public void incresePower(){
        if(running && (power < 10)){
            power++;
            System.out.println("Engine power increased to " + power);
        }      
    }
    public void decreasePower() {
        if(running && (power > 10)){
            power--;
            System.out.println("Engine power decreased to " + power);
        }        
    }
    
    public int getSize() {
        return size;
    }

    public boolean isTurbo() {
        return turbo;
    }

    
    
    
}
