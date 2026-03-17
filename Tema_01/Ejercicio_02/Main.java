import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la ruta del archivo de datos (.txt): ");
        String ruta = sc.nextLine();

        MatrizMinera matriz = LectorArchivo.leerArchivo(ruta);

        if (matriz == null) {
            System.out.println("No se pudo cargar la matriz. Terminando programa.");
            sc.close();
            return;
        }

        System.out.print("Ingrese el tamano k de la subregion cuadrada (k x k): ");
        int k = sc.nextInt();

        matriz.mostrarMejorSubregion(k);

        sc.close();
    }
}
