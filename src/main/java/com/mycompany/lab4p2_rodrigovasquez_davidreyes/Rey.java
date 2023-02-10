package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

/**
 *
 * @author Rui
 */
public class Rey extends Pieza{

    public Rey(String name, int x, int y) {
        super(name, x, y);

    }

    public Rey() {
    }
    
    @Override
    public boolean movimiento(int x, int y, int finalX, int finalY, Object[][] tablero, int player) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (finalX > 7 || finalX < 0) {
                    
                } else if (finalY > 7 || finalY < 0) {
                    
                } else {
                    
                }
            }
        }
    }

}
