import java.util.*;
public class Coordenada{
private double x;
private double y;
//Constructor, initialize x, y attributes to zero
public Coordenada( ){
  this.x = 0;
  this.y = 0;
  }
//Constructor
public Coordenada(double x, double y ){
// fill in the code here
  this.x = x;
  this.y = y;
}
//Constructor
public Coordenada(Coordenada c ){
// fill in the code here
  this.x = c.getX();
  this.y = c.getY();
}
//métodos setter
void setX(double x) {
// fill in the code here}
  this.x = x;
}
void setY(double y){
// fill in the code here
  this.y = y;
  
}
//métodos getter
double getX(){
// fill in the code here
  return x;
}
double getY(){
// fill in the code here
  return y; 
}
//método de instancia que calcula la distancia euclideana
double distancia(Coordenada c){
// fill in the code here
  double dif_x = this.x - c.getX();
  double dif_y = this.y - c.getY();
  double raiz_xy = Math.sqrt(dif_x * dif_x + dif_y * dif_y);
  return raiz_xy; 
  
}
//método de clase que calcula la distancia euclideana
static double distancia(Coordenada c1, Coordenada c2){
// fill in the code here
  double dif_x = c1.getX() - c2.getX();
  double dif_x = c1.getX() - c2.getX();
  double raiz_xy = Math.sqrt(dif_x * dif_x + dif_y * dif_y);
  return raiz_xy; 
}
//método que devuelve los valores de una coordenada en determinado formato
String toString(){
// fill in the code here
  return "(" + x + ", " + y + ")";
}
}
