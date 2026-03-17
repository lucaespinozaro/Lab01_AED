public class Zona {
    private String tipoMineral;
    private int cantidad;
    private double pureza;

    public Zona(String tipoMineral, int cantidad, double pureza) {
        this.tipoMineral = tipoMineral;
        this.cantidad = cantidad;
        this.pureza = pureza;
    }

    public double getValorEconomico() {
        return cantidad * pureza;
    }

    public String getTipoMineral() {
        return tipoMineral;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPureza() {
        return pureza;
    }

    @Override
    public String toString() {
        return tipoMineral + " cantidad: " + cantidad + "  pureza: " + pureza
                + "  Valor: " + String.format("%.2f", getValorEconomico());
    }
}
