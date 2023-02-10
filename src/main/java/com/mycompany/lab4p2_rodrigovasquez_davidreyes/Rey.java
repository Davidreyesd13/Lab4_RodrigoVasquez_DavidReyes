package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

/**
 *
 * @author Rui
 */
public class Rey extends Pieza{

    public Rey(String name, int x, int y) {
        super(name, x, y);
        if (super.getName().equals("k")) {
            super.setX(7);
            super.setY(4);
        } else if (super.getName().equals("K")) {
            super.setX(0);
            super.setY(4);
        }
    }

    public Rey() {
    }
    
    @Override
    public void movimiento() {
        
    }

}
