package com.mycompany.lab4p2_rodrigovasquez_davidreyes;

/**
 *
 * @author Rui
 */
public abstract class Pieza {
    protected String name;
    protected int x, y;

    public Pieza(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Pieza() {
    }
    
    public abstract boolean movimiento(int x, int y, int finalX, int finalY, Object[][] tablero, int player);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Pieza{" + "name=" + name + ", x=" + x + ", y=" + y + '}';
    }
}
