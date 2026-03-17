import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad maxima de rectangulos: ");
        int n = sc.nextInt();
        ContainerRect contenedor = new ContainerRect(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nRectangulo " + (i + 1));
            System.out.print("Ingrese una esquina: ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            Coordenada c1 = new Coordenada(x1, y1);

            System.out.print("Ingrese la esquina opuesta: ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Coordenada c2 = new Coordenada(x2, y2);

            Rectangulo r = new Rectangulo(c1, c2);
            contenedor.addRectangulo(r);
        }

        System.out.println("\nListado de rectangulos almacenados:");
        System.out.println(contenedor.toString());

        sc.close();
    }
}
