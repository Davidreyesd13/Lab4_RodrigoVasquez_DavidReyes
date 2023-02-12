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
//                    tablero[i][j] = new Dama("q", i, j);
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
//                    tablero[i][j] = new Dama("Q", i, j);
                }
            }
        }

        int jug = 1, posfx = 0, posiniy, posinix, posfy;
        while (f) {
            String[] pos, xy;
            if (jug == 1) {
                impresion(tablero);
                System.out.println("Turno " + jd1);
                //imprimir
                System.out.println("Ingrese la Posicion que desea mover");
                l.nextLine();
                String pos1 = l.nextLine();
                pos = pos1.split("\\|");
                if (pos1.equals("gusbai")) {
                    System.exit(0);
                }
                switch (pos[0].charAt(0)) {
                    case 'P':
                        xy = pos[1].split("\\-");
                        switch (xy[0].charAt(0)) {
                            case 'A':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'B':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'C':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'D':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'E':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'F':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'G':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'H':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                        }

                    case 'N':
                        xy = pos[1].split("\\-");
                        switch (xy[0].charAt(0)) {
                            case 'A':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posfy][posfx]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'B':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'C':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'D':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'E':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'F':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'G':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 2;
                                break;
                            case 'H':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                        }
                    case 'B':
                        xy = pos[1].split("\\-");
                        switch (xy[0].charAt(0)) {
                            case 'A':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'B':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'C':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'D':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'E':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'F':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'G':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'H':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;

                        }
                    case 'K':
                        xy = pos[1].split("\\-");
                        System.out.println(xy[0]);
                        switch (xy[0].charAt(0)) {
                            case 'A':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'B':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'C':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'D':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'E':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'F':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'G':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'H':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;

                        }
                    case 'Q':
                        System.out.println("Si entre");
                        xy = pos[1].split("\\-");
                        System.out.println(xy[0]);
                        switch (xy[0].charAt(0)) {
                            case 'A':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'B':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'C':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'D':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'E':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'F':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'G':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'H':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;

                        }
                    case 'R':

                        xy = pos[1].split("\\-");

                        switch (xy[0].charAt(0)) {
                            case 'A':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'B':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'C':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'D':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'E':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'F':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'G':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                            case 'H':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'A':
                                        posfx = 0;
                                        break;
                                    case 'B':
                                        posfx = 1;
                                        break;
                                    case 'C':
                                        posfx = 2;
                                        break;
                                    case 'D':
                                        posfx = 3;
                                        break;
                                    case 'E':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'G':

                                        posfx = 6;
                                        break;
                                    case 'H':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=2;
                                break;
                        }
                    default:
                        System.out.println("Coordenada no valida");
                        break;
                }
            } else {
                impresion(tablero);
                System.out.println("Turno " + jd2);
                System.out.println("Ingrese la Posicion que desea mover");
                l.nextLine();
                 String pos1 = l.nextLine();
                

                if (pos1.equals("gusbai")) {
                    System.exit(0);
                }
                pos = pos1.split("\\|");
                switch (pos[0].charAt(0)) {
                    case 'p':
                        xy = pos[1].split("\\-");
                        switch (xy[0].charAt(0)) {
                            case 'a':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug =1;
                                break;
                            case 'b':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'c':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug =1;
                                break;
                            case 'd':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug =1;
                                break;
                            case 'e':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'f':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'g':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':
                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'h':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Peon) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                        }

                    case 'n':
                        xy = pos[1].split("\\-");
                        switch (xy[0].charAt(0)) {
                            case 'a':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posfy][posfx]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'b':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug =1;
                                break;
                            case 'c':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'd':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'e':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'f':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug =1;
                                break;
                            case 'g':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug = 1;
                                break;
                            case 'h':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Caballo) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                        }
                    case 'b':
                        xy = pos[1].split("\\-");
                        switch (xy[0].charAt(0)) {
                            case 'a':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'b':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'c':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'd':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'e':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'f':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'g':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'h':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Alfil) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;

                        }
                    case 'k':
                        xy = pos[1].split("\\-");
                        System.out.println(xy[0]);
                        switch (xy[0].charAt(0)) {
                            case 'a':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'b':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'c':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'd':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'e':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'f':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'g':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'h':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;

                        }
                    case 'q':
                        System.out.println("Si entre");
                        xy = pos[1].split("\\-");
                        System.out.println(xy[0]);
                        switch (xy[0].charAt(0)) {
                            case 'a':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'b':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'c':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'F':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'd':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'e':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'f':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'g':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Dama) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'h':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                
                                if (((Rey) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;

                        }
                    case 'r':

                        xy = pos[1].split("\\-");

                        switch (xy[0].charAt(0)) {
                            case 'A':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 0;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'b':
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                posinix = 1;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'c':
                                posinix = 2;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'd':
                                posinix = 3;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'e':
                                posinix = 4;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'f':
                                posinix = 5;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'g':
                                posinix = 6;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                            case 'h':
                                posinix = 7;
                                posiniy = xy[0].charAt(1) - 48;
                                posfy = xy[1].charAt(1) - 48;
                                switch (xy[1].charAt(0)) {
                                    case 'a':
                                        posfx = 0;
                                        break;
                                    case 'b':
                                        posfx = 1;
                                        break;
                                    case 'c':
                                        posfx = 2;
                                        break;
                                    case 'd':
                                        posfx = 3;
                                        break;
                                    case 'e':
                                        posfx = 4;
                                        break;
                                    case 'f':
                                        posfx = 5;
                                        break;
                                    case 'g':

                                        posfx = 6;
                                        break;
                                    case 'h':

                                        posfx = 7;
                                        break;
                                }
                                if (((Torre) tablero[posiniy][posinix]).movimiento(posinix, posiniy, posfx, posfy, tablero, jug)) {
                                    ((Pieza) tablero[posfy][posfx]).setName("P");
                                    ((Pieza) tablero[posiniy][posinix]).setName(" ");
                                } else {
                                    System.out.println("Movimiento no valido");
                                }
                                jug=1;
                                break;
                        }
                    default:
                        System.out.println("Coordenada no valida");
                        break;
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
