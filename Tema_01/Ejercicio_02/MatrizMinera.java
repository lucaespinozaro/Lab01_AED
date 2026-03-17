public class MatrizMinera {
    private Zona[][] matriz;
    private int filas;
    private int columnas;

    public MatrizMinera(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Zona[filas][columnas];
    }

    public void setZona(int fila, int columna, Zona zona) {
        matriz[fila][columna] = zona;
    }

    public Zona getZona(int fila, int columna) {
        return matriz[fila][columna];
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public double calcularValorSubregion(int filaInicio, int colInicio, int k) {
        double total = 0;
        for (int i = filaInicio; i < filaInicio + k; i++) {
            for (int j = colInicio; j < colInicio + k; j++) {
                total += matriz[i][j].getValorEconomico();
            }
        }
        return total;
    }

    public String getMineralPredominante(int filaInicio, int colInicio, int k) {
        String[] minerales = new String[k * k];
        int[] conteos = new int[k * k];
        int totalMinerales = 0;

        for (int i = filaInicio; i < filaInicio + k; i++) {
            for (int j = colInicio; j < colInicio + k; j++) {
                String tipo = matriz[i][j].getTipoMineral();
                boolean encontrado = false;
                for (int m = 0; m < totalMinerales; m++) {
                    if (minerales[m].equals(tipo)) {
                        conteos[m]++;
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    minerales[totalMinerales] = tipo;
                    conteos[totalMinerales] = 1;
                    totalMinerales++;
                }
            }
        }

        String predominante = minerales[0];
        int maxConteo = conteos[0];
        for (int m = 1; m < totalMinerales; m++) {
            if (conteos[m] > maxConteo) {
                maxConteo = conteos[m];
                predominante = minerales[m];
            }
        }
        return predominante;
    }

    public int[] encontrarMejorSubregion(int k) {
        if (k > filas || k > columnas) {
            System.out.println("Error: k es mayor que las dimensiones de la matriz.");
            return null;
        }

        double maxValor = -1;
        int mejorFila = 0;
        int mejorCol = 0;

        for (int i = 0; i <= filas - k; i++) {
            for (int j = 0; j <= columnas - k; j++) {
                double valor = calcularValorSubregion(i, j, k);
                if (valor > maxValor) {
                    maxValor = valor;
                    mejorFila = i;
                    mejorCol = j;
                }
            }
        }

        return new int[]{mejorFila, mejorCol};
    }

    public void mostrarMejorSubregion(int k) {
        int[] posicion = encontrarMejorSubregion(k);
        if (posicion == null) return;

        int fila = posicion[0];
        int col = posicion[1];
        double valorTotal = calcularValorSubregion(fila, col, k);
        String mineralPred = getMineralPredominante(fila, col, k);

        System.out.println("Región más valiosa encontrada:\n");

        System.out.println("Posición inicial: (" + fila + ", " + col + ")");
        System.out.println("Tamaño de la región: " + k + " x " + k + "\n");

        System.out.println("Zonas analizadas:");
        for (int i = fila; i < fila + k; i++) {
            for (int j = col; j < col + k; j++) {
                Zona z = matriz[i][j];
                System.out.println("[ " + z.getTipoMineral() +
                        ", cantidad: " + z.getCantidad() +
                        ", pureza: " + z.getPureza() + " ]");
            }
        }

        System.out.println("\nValor total estimado: " + String.format("%.2f", valorTotal));

        System.out.println("\nMineral predominante en la región: " + mineralPred);
    }
}
