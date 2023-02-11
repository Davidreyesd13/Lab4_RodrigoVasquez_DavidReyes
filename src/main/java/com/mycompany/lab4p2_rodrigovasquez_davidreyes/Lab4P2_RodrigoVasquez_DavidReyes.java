package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

import java.util.Scanner;

public class Lab4P2_RodrigoVasquez_DavidReyes {

    static String[] alfa = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public static void main(String[] args) {
        boolean f = true;

        Scanner l = new Scanner(System.in);
        Object[][] tablero = new Object[8][8];
        System.out.println("Ingrese el nombre del Jugador 1");
        String jd1 = l.next();
        System.out.println("Ingrese el nombre del Jugador 2");
        String jd2 = l.next();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i == 1 && j >= 0 && j <= 8 && i == 1) {
                    tablero[i][j] = new Peon("p", i, j);
                } else if (i == 0 && j == 2 || i == 0 && j == 5) {
                    tablero[i][j] = new Alfil("b", i, j);
                } else if (i == 0 && j == 1 || i == 0 && j == 6) {
                    tablero[i][j] = new Caballo("n", i, j);
                } else if (i == 0 && j == 0 || i == 0 && j == 7) {
                    tablero[i][j] = new Torre("r", i, j);
                } else if (i == 0 && j == 3) {
                    tablero[i][j] = new Rey("k", i, j);
                } else if (i == 0 && j == 4) {
                    tablero[i][j] = new Dama("q", i, j);
                }
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i == 6 && j >= 0 && j <= 7 && i == 6) {
                    tablero[i][j] = new Peon("P", i, j);
                } else if (i == 7 && j == 2 || i == 7 && j == 5) {
                    tablero[i][j] = new Alfil("B", i, j);
                } else if (i == 7 && j == 1 || i == 7 && j == 6) {
                    tablero[i][j] = new Caballo("N", i, j);
                } else if (i == 7 && j == 0 || i == 7 && j == 7) {
                    tablero[i][j] = new Torre("R", i, j);
                } else if (i == 7 && j == 3) {
                    tablero[i][j] = new Rey("K", i, j);
                } else if (i == 7 && j == 4) {
                    tablero[i][j] = new Dama("Q", i, j);
                }
            }
        }

        int jug = 1, posf, posini;
        while (f) {
            String[] pos, x, y;
            if (jug == 1) {
                impresion(tablero);
                System.out.println("Turno " + jd1);
                //imprimir
                System.out.println("Ingrese la Posicion que desea mover");
                l.nextLine();
                String pos1 = l.nextLine();
                pos = pos1.split("\\|");
                jug = 2;
                if (pos1.equals("gusbai")) {
                    System.exit(0);
                }
                for (int i = 0; i < pos.length; i++) {
                    switch (pos[0]) {
                        case "P":
                            
                            break;
                        case "N":
                            break;
                        case "":
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                System.out.println("Ingrese la Posicion que desea mover");
                l.nextLine();
                String pos2 = l.nextLine();
                jug = 1;
                System.out.println("Turno " + jd2);
                if (pos2.equals("gusbai")) {
                    System.exit(0);
                }
            }
        }
    }

    static private boolean Jaque(Object[][] tablero) {

        boolean result = true;
        return result;
    }

    static private void impresion(Object[][] Tablero) {
        System.out.println("  A  B  C  D  E  F  G  H");
        for (int i = 0; i < Tablero.length; i++) {
            System.out.print(i + "");
            for (int j = 0; j < Tablero.length; j++) {
                
                if (Tablero[i][j] == null) {
                    System.out.print("[ " + "]");
                } else {
                    System.out.print("[" + ((Pieza) Tablero[i][j]).getName() + "]");
                }
            }
            System.out.println("");
        }
    }
}
