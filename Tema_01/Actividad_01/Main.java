import java.util.Scanner;

public class Main{
  public static void main(){

    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese una esquina del 1er rectángulo: ");
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    Coordenada c1 = new Coordenada(x1, y1);

    System.out.print("Ingrese otra esquina del 1er rectángulo: ");
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();
    Coordenada c2 = new Coordenanda(x2, y2);

    Rectangulo r1 = new Rectangulo(c1, c2);

    System.out.print("Ingrese una esquina del 2do rectángulo: ");
    x1 = sc.nextDouble();
    y1 = sc.nextDouble();
    c1 = new Coordenada(x1, y1);

    System.out.print("Ingrese otra esquina del 2do rectángulo: ");
    x2 = sc.nextDouble();
    y2 = sc.nextDouble();
    c2 = new Coordenada(x2, y2);

    Rectangulo r2 = new Rectangulo(c1, c2);

    System.out.print("Ingrese una opcion \n1. Sobrepuesto ");

    
  }
}
