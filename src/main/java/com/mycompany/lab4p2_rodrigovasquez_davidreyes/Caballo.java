package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

/**
 *
 * @author Rui
 */
public class Caballo extends Pieza {

    public Caballo(String name, int x, int y) {
        super(name, x, y);
    }

    public Caballo() {
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
                if (x + 2 == finalX) {
                    if (y + 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else if (y - 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (x - 2 == finalX) {
                    if (y + 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else if (y - 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (y + 2 == finalY) {
                    if (x + 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else if (x - 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                } else if (y - 2 == finalY) {
                    if (x + 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else if (x - 2 == finalY) {
                        if (tablero[finalX][finalY] instanceof Pieza) {
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
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("Q")) {
                                movimiento = false;
                                return movimiento;
                            } else if (((Pieza) tablero[finalX][finalY]).getName().equals("K")) {
                                movimiento = false;
                                return movimiento;
                            }
                        } else {
                            movimiento = true;
                            return movimiento;
                        }
                    } else {
                        movimiento = false;
                        return movimiento;
                    }
                }
            }
        }
        return movimiento;
    }

}
