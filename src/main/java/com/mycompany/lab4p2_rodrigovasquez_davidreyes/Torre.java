package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

/**
 *
 * @author Rui
 */
public class Torre extends Pieza {

    public Torre(String name, int x, int y) {
        super(name, x, y);
    }

    public Torre() {
    }

    @Override
    public boolean movimiento(int x, int y, int finalX, int finalY, Object[][] tablero, int player) {
        boolean movimiento = false;

        if (finalX > 7 || finalX < 0) {
            return movimiento;
        } else if (finalY > 7 || finalY < 0) {
            return movimiento;
        } else {
            if (player == 1) {

            }
        }
        return movimiento;
    }

}
