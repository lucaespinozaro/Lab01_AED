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

        boolean fueraHorizontal = (r1_maxX <= r2_minX) || (r1_minX >= r2_maxX);
        boolean fueraVertical = (r1_maxY <= r2_minY) || (r1_minY >= r2_maxY);

        if (!fueraHorizontal && !fueraVertical) {
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

        boolean solapaX = Math.max(r1_minX, r2_minX) < Math.min(r1_maxX, r2_maxX);
        boolean solapaY = Math.max(r1_minY, r2_minY) < Math.min(r1_maxY, r2_maxY);

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
