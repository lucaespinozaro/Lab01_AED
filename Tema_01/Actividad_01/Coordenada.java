package Actividad_01;

import java.util.*;

public class Coordenada {

    private double x;
    private double y;

    // Constructor, initialize x, y attributes to zero
    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructor copia
    public Coordenada(Coordenada c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    // Métodos setter
    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    // Métodos getter
    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    // Método de instancia que calcula la distancia euclidiana
    double distancia(Coordenada c) {
        double dif_x = this.x - c.getX();
        double dif_y = this.y - c.getY();
        double raiz_xy = Math.sqrt(dif_x * dif_x + dif_y * dif_y);
        return raiz_xy;
    }

    // Método de clase que calcula la distancia euclidiana
    static double distancia(Coordenada c1, Coordenada c2) {
        double dif_x = c1.getX() - c2.getX();
        double dif_y = c1.getY() - c2.getY();
        double raiz_xy = Math.sqrt(dif_x * dif_x + dif_y * dif_y);
        return raiz_xy;
    }

    // Método que devuelve los valores de la coordenada en formato (x, y)
    String toString() {
        return "(" + x + ", " + y + ")";
    }
}
