public class Verificador {
public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        double r1_minX = r1.getEsquina1().getX();
        double r1_minY = r1.getEsquina1().getY();
        double r1_maxX = r1.getEsquina2().getX();
        double r1_maxY = r1.getEsquina2().getY();

        double r2_minX = r2.getEsquina1().getX();
        double r2_minY = r2.getEsquina1().getY();
        double r2_maxX = r2.getEsquina2().getX();
        double r2_maxY = r2.getEsquina2().getY();
        
        boolean shrz = (r1_maxX < r2_minX) || (r1_minX > r2_maxX);
        boolean sver = (r1_maxY < r2_minY) || (r1_minY > r2_maxY);
        if (!shrz && !sver) {
            return true;
        } else {
            return false;
        }
    }
        
public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        if (esSobrePos(r1, r2)) return false;       
        double r1_minX = r1.getEsquina1().getX();
        double r1_maxX = r1.getEsquina2().getX();
        double r2_minX = r2.getEsquina1().getX();
        double r2_maxX = r2.getEsquina2().getX();
        
        boolean tcX = (r1_maxX == r2_minX) || (r1_minX == r2_maxX);
        boolean tcY = (r1.getEsquina2().getY() == r2.getEsquina1().getY()) || (r1.getEsquina1().getY() == r2.getEsquina2().getY());
        return tcX || tcY;
    }

public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }
}
