import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Rectangulo A");
        System.out.print("Ingrese una esquina del 1er rectangulo: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Coordenada a1 = new Coordenada(x1, y1);

        System.out.print("Ingrese la esquina opuesta del 1er rectangulo: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Coordenada a2 = new Coordenada(x2, y2);

        Rectangulo A = new Rectangulo(a1, a2);

        System.out.println("Rectangulo B");
        System.out.print("Ingrese una esquina del 2do rectangulo: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        Coordenada b1 = new Coordenada(x1, y1);

        System.out.print("Ingrese la esquina opuesta del 2do rectangulo: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        Coordenada b2 = new Coordenada(x2, y2);

        Rectangulo B = new Rectangulo(b1, b2);

        System.out.println("Rectángulo A = " + A);
        System.out.println("Rectángulo B = " + B);

        sc.close();
    }
}
