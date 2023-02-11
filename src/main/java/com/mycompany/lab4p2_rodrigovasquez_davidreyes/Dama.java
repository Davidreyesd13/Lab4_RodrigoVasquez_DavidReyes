package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

/**
 *
 * @author Rui
 */
public class Dama extends Pieza {

    public Dama(String name, int x, int y) {
        super(name, x, y);
    }

    public Dama() {
    }

    @Override
    public boolean movimiento(int x, int y, int finalX, int finalY, Object[][] tablero, int player) {
        boolean movimiento = false;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (finalX > 7 || finalX < 0) {
                    return movimiento;
                } else if (finalY > 7 || finalY < 0) {
                    return movimiento;
                } else {
                    if (player == 1) {
                        if (x - 1 == finalX && y == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else if (x == finalX && y - 1 == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else if (x + 1 == finalX && y == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else if (x == finalX && y + 1 == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else if (x - 1 == finalX && y - 1 == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else if (x - 1 == finalX && y + 1 == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else if (x + 1 == finalX && y - 1 == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else if (x + 1 == finalX && y + 1 == finalY) {
                            if (((Pieza) tablero[finalX][finalY]).getName().equals("p")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("n")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("b")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("r")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("q")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("k")) {
                                movimiento = true;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("P")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("N")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("B")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("R")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            if (((x + 2 <= 7) && (y + 2 <= 7)) && ((x + 2 == finalX) && (y + 2 == finalY))) {

                            } else if (((x + 3 <= 7) && (y + 3 <= 7)) && ((x + 3 == finalX) && (y + 3 == finalY))) {

                            } else if (((x + 4 <= 7) && (y + 4 <= 7)) && ((x + 4 == finalX) && (y + 4 == finalY))) {
 
                            } else if (((x + 5 <= 7) && (y + 5 <= 7)) && ((x + 5 == finalX) && (y + 5 == finalY))) {

                            } else if (((x + 6 <= 7) && (y + 6 <= 7)) && ((x + 6 == finalX) && (y + 6 == finalY))) {

                            } else if (((x + 7 <= 7) && (y + 7 <= 7)) && ((x + 7 == finalX) && (y + 7 == finalY))) {

                            } else if (((x - 2 >= 0) && (y - 2 >= 0)) && ((x - 2 == finalX) && (y - 2 == finalY))) {

                            } else if (((x - 3 >= 0) && (y - 3 >= 0)) && ((x - 2 == finalX) && (y - 3 == finalY))) {

                            } else if (((x - 4 >= 0) && (y - 7 >= 0)) && ((x - 2 == finalX) && (y - 4 == finalY))) {

                            } else if (((x - 5 >= 0) && (y - 7 >= 0)) && ((x - 2 == finalX) && (y - 5 == finalY))) {

                            } else if (((x - 6 >= 0) && (y - 7 >= 0)) && ((x - 2 == finalX) && (y - 6 == finalY))) {

                            } else if ((x - 7 >= 0) && (y - 7 >= 0)) {

                            } else if ((x + 2 <= 7) && (y - 2 <= 7)) {

                            } else if ((x + 3 <= 7) && (y - 3 <= 7)) {

                            } else if ((x + 4 <= 7) && (y - 4 <= 7)) {

                            } else if ((x + 5 <= 7) && (y - 5 <= 7)) {

                            } else if ((x + 6 <= 7) && (y - 6 <= 7)) {

                            } else if ((x + 7 <= 7) && (y - 7 <= 7)) {

                            } else if ((x - 2 <= 7) && (y + 7 <= 7)) {

                            } else if ((x - 3 <= 7) && (y + 7 <= 7)) {

                            } else if ((x - 4 <= 7) && (y + 7 <= 7)) {

                            } else if ((x - 5 <= 7) && (y + 7 <= 7)) {

                            } else if ((x - 6 <= 7) && (y + 7 <= 7)) {

                            } else if ((x - 7 <= 7) && (y + 7 <= 7)) {

                            }
                        }
                    }
                }
            }
        }

    }
