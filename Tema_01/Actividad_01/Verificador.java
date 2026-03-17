public class Verificador {

    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        boolean separadoHrz = (r1.getMaxX() <= r2.getMinX()) || (r1.getMinX() >= r2.getMaxX());
        boolean separadoVrc = (r1.getMaxY() <= r2.getMinY()) || (r1.getMinY() >= r2.getMaxY());

        if (!separadoHrz && !separadoVrc) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        if (esSobrePos(r1, r2)) {
            return false;
        }

        double mayMinX = (r1.getMinX() > r2.getMinX()) ? r1.getMinX() : r2.getMinX();
        double menMaxX = (r1.getMaxX() < r2.getMaxX()) ? r1.getMaxX() : r2.getMaxX();
        boolean comparteX = mayMinX < menMaxX;

        double mayMinY = (r1.getMinY() > r2.getMinY()) ? r1.getMinY() : r2.getMinY();
        double menMaxY = (r1.getMaxY() < r2.getMaxY()) ? r1.getMaxY() : r2.getMaxY();
        boolean comparteY = mayMinY < menMaxY;

        boolean juntoX = (r1.getMaxX() == r2.getMinX()) || (r1.getMinX() == r2.getMaxX());
        boolean juntoY = (r1.getMaxY() == r2.getMinY()) || (r1.getMinY() == r2.getMaxY());

        if ((juntoX && comparteY) || (juntoY && comparteX) || (juntoX && juntoY)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        if (!esSobrePos(r1, r2) && !esJunto(r1, r2)) {
            return true;
        } else {
            return false;
        }
    }
}
