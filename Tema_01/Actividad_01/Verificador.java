public class Verificador {

    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        double r1_minX = r1.getEsquina1().getX();
        double r1_maxX = r1.getEsquina2().getX();
        double r1_minY = r1.getEsquina1().getY();
        double r1_maxY = r1.getEsquina2().getY();

        double r2_minX = r2.getEsquina1().getX();
        double r2_maxX = r2.getEsquina2().getX();
        double r2_minY = r2.getEsquina1().getY();
        double r2_maxY = r2.getEsquina2().getY();

        boolean separadoHrz = (r1_maxX <= r2_minX) || (r1_minX >= r2_maxX);
        boolean separadoVrc = (r1_maxY <= r2_minY) || (r1_minY >= r2_maxY);

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

        double r1_minX = r1.getEsquina1().getX();
        double r1_maxX = r1.getEsquina2().getX();
        double r1_minY = r1.getEsquina1().getY();
        double r1_maxY = r1.getEsquina2().getY();

        double r2_minX = r2.getEsquina1().getX();
        double r2_maxX = r2.getEsquina2().getX();
        double r2_minY = r2.getEsquina1().getY();
        double r2_maxY = r2.getEsquina2().getY();

        // Lógica manual para solapaX
        double maxMinX = (r1_minX > r2_minX) ? r1_minX : r2_minX;
        double minMaxX = (r1_maxX < r2_maxX) ? r1_maxX : r2_maxX;
        boolean solapaX = maxMinX < minMaxX;

        // Lógica manual para solapaY
        double maxMinY = (r1_minY > r2_minY) ? r1_minY : r2_minY;
        double minMaxY = (r1_maxY < r2_maxY) ? r1_maxY : r2_maxY;
        boolean solapaY = maxMinY < minMaxY;

        boolean tocaX = (r1_maxX == r2_minX) || (r1_minX == r2_maxX);
        boolean tocaY = (r1_maxY == r2_minY) || (r1_minY == r2_maxY);

        if ((tocaX && solapaY) || (tocaY && solapaX) || (tocaX && tocaY)) {
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
