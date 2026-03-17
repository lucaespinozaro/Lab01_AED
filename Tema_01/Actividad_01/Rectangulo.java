import java.util.*;
public class Rectangulo{
  private Coordenada esquina1;
  private Coordenada esquina2;

  public Rectangulo(Coordenada c1, Coordenada c2) {
    this.esquina1 = new Coordenada(c1.getX(), c1.getY());
    this.esquina2 = new Coordenada(c2.getX(), c2.getY());
  }
  public void setEsquina1(Coordenada coo) {
    this.esquina1.setX(coo.getX());
    this.esquina1.setY(coo.getY());
  }
  public void setEsquina2(Coordenada coo) {
    this.esquina2.setX(coo.getX());
    this.esquina2.setY(coo.getY());
  }

  public Coordenada getEsquina1() {
    return esquina1;
  }
  public Coordenada getEsquina2() {
    return esquina2;
  }
  public String toString() {
    return "X1: " + esquina1.getX() + " | Y1: " + esquina1.getY() +
      "\nX2: " + esquina2.getX() + " | Y2: " + esquina2.getY();
  }
}
