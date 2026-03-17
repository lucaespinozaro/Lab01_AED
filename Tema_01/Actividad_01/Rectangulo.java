import java.util.*;

public class Rectangulo {

    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        double minX = Math.min(c1.getX(), c2.getX());
        double minY = Math.min(c1.getY(), c2.getY());
        double maxX = Math.max(c1.getX(), c2.getX());
        double maxY = Math.max(c1.getY(), c2.getY());
        
        this.esquina1 = new Coordenada(minX, minY);
        this.esquina2 = new Coordenada(maxX, maxY);
    }

    public void setEsquina1(Coordenada coo) {
        this.esquina1 = new Coordenada(coo);
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = new Coordenada(coo);
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public double calculoArea() {
        double base = esquina2.getX() - esquina1.getX();
        double altura = esquina2.getY() - esquina1.getY();
        return base * altura;
    }

    public String toString() {
        return "(" + esquina1 + ", " + esquina2 + ")";
    }
}
