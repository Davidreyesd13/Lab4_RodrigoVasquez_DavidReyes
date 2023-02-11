package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

/**
 *
 * @author Rui
 */
public class Alfil extends Pieza {

    public Alfil(String name, int x, int y) {
        super(name, x, y);
    }

    public Alfil() {
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
                if (((x + 2 <= 7) && (y + 2 <= 7)) && ((x + 2 == finalX) && (y + 2 == finalY))) {
                    if (tablero[x + 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 3 <= 7) && (y + 3 <= 7)) && ((x + 3 == finalX) && (y + 3 == finalY))) {
                    if (tablero[x + 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 4 <= 7) && (y + 4 <= 7)) && ((x + 4 == finalX) && (y + 4 == finalY))) {
                    if (tablero[x + 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 5 <= 7) && (y + 5 <= 7)) && ((x + 5 == finalX) && (y + 5 == finalY))) {
                    if (tablero[x + 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 5][y + 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 6 <= 7) && (y + 6 <= 7)) && ((x + 6 == finalX) && (y + 6 == finalY))) {
                    if (tablero[x + 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 5][y + 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 6][y + 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 7 <= 7) && (y + 7 <= 7)) && ((x + 7 == finalX) && (y + 7 == finalY))) {
                    if (tablero[x + 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 5][y + 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 6][y + 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 7][y + 7] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 2 >= 0) && (y - 2 >= 0)) && ((x - 2 == finalX) && (y - 2 == finalY))) {
                    if (tablero[x - 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 3 >= 0) && (y - 3 >= 0)) && ((x - 3 == finalX) && (y - 3 == finalY))) {
                    if (tablero[x - 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 4 >= 0) && (y - 4 >= 0)) && ((x - 4 == finalX) && (y - 4 == finalY))) {
                    if (tablero[x - 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 5 >= 0) && (y - 5 >= 0)) && ((x - 5 == finalX) && (y - 5 == finalY))) {
                    if (tablero[x - 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 5][y - 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 6 >= 0) && (y - 6 >= 0)) && ((x - 6 == finalX) && (y - 6 == finalY))) {
                    if (tablero[x - 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 5][y - 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 6][y - 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 7 >= 0) && (y - 7 >= 0)) && ((x - 7 == finalX) && (y - 7 == finalY))) {
                    if (tablero[x - 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 5][y - 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 6][y - 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 7][y - 7] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 2 <= 7) && (y - 2 >= 0)) && ((x + 2 == finalX) && (y - 2 == finalY))) {
                    if (tablero[x + 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 3 <= 7) && (y - 3 >= 0)) && ((x + 3 == finalX) && (y - 3 == finalY))) {
                    if (tablero[x + 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 4 <= 7) && (y - 4 >= 0)) && ((x + 4 == finalX) && (y - 4 == finalY))) {
                    if (tablero[x + 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 5 <= 7) && (y - 5 >= 0)) && ((x + 5 == finalX) && (y - 5 == finalY))) {
                    if (tablero[x + 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 5][y - 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 6 <= 7) && (y - 6 >= 0)) && ((x + 6 == finalX) && (y - 6 == finalY))) {
                    if (tablero[x + 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 5][y - 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 6][y - 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x + 7 <= 7) && (y - 7 >= 0)) && ((x + 7 == finalX) && (y - 7 == finalY))) {
                    if (tablero[x + 1][y - 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 2][y - 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 3][y - 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 4][y - 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 5][y - 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 6][y - 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x + 7][y - 7] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 2 >= 0) && (y + 2 <= 7)) && ((x - 2 == finalX) && (y + 2 == finalY))) {
                    if (tablero[x - 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 3 >= 0) && (y + 3 <= 7)) && ((x - 3 == finalX) && (y + 3 == finalY))) {
                    if (tablero[x - 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 4 >= 0) && (y + 4 <= 7)) && ((x - 4 == finalX) && (y + 4 == finalY))) {
                    if (tablero[x - 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 5 >= 0) && (y + 5 <= 7)) && ((x - 5 == finalX) && (y + 5 == finalY))) {
                    if (tablero[x - 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 5][y + 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 6 >= 0) && (y + 6 <= 7)) && ((x - 6 == finalX) && (y + 6 == finalY))) {
                    if (tablero[x - 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 5][y + 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 6][y + 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (((x - 7 >= 0) && (y + 7 <= 7)) && ((x - 7 == finalX) && (y + 7 == finalY))) {
                    if (tablero[x - 1][y + 1] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 2][y + 2] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 3][y + 3] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 4][y + 4] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 5][y + 5] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 6][y + 6] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else if (tablero[x - 7][y + 7] == null || ((Pieza) tablero[finalX][finalY]).getName().equals("p") || ((Pieza) tablero[finalX][finalY]).getName().equals("n")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("b") || ((Pieza) tablero[finalX][finalY]).getName().equals("r")
                            || ((Pieza) tablero[finalX][finalY]).getName().equals("q") || ((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                        movimiento = true;
                        return movimiento;
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                }
            }
        }
        return movimiento ;
    }
    
}
