import java.util.*;

public class Coordenada {
    private double x;
    private double y;

    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(Coordenada c) {
        double dif_x = this.x - c.getX();
        double dif_y = this.y - c.getY();
        return Math.sqrt(dif_x * dif_x + dif_y * dif_y);
    }

    public static double distancia(Coordenada c1, Coordenada c2) {
        double dif_x = c1.getX() - c2.getX();
        double dif_y = c1.getY() - c2.getY();
        return Math.sqrt(dif_x * dif_x + dif_y * dif_y);
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
