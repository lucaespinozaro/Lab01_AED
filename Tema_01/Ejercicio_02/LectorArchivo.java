import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivo {
    public static MatrizMinera leerArchivo(String ruta) {
        MatrizMinera matrizMinera = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String primeraLinea = br.readLine();
            String[] dimensiones = primeraLinea.trim().split(" ");
            int filas = Integer.parseInt(dimensiones[0]);
            int columnas = Integer.parseInt(dimensiones[1]);

            matrizMinera = new MatrizMinera(filas, columnas);
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    String linea = br.readLine();
                    if (linea == null) {
                        System.out.println("Error: el archivo tiene menos datos de los esperados.");
                        br.close();
                        return null;
                    }
                    String[] partes = linea.trim().split(" ");
                    String tipoMineral = partes[0];
                    int cantidad = Integer.parseInt(partes[1]);
                    double pureza = Double.parseDouble(partes[2]);

                    Zona zona = new Zona(tipoMineral, cantidad, pureza);
                    matrizMinera.setZona(i, j, zona);
                }
            }

            br.close();
            System.out.println("Archivo leido correctamente: " + filas + "x" + columnas + " zonas cargadas.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del archivo: " + e.getMessage());
        }

        return matrizMinera;
    }
}
