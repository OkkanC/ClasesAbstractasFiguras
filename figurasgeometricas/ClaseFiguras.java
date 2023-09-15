
package figurasgeometricas;


public abstract class ClaseFiguras{

 protected double base;
 protected double altura;
 protected double ancho;
 String nombre;
 
 abstract double calcularArea(double base, double altura, double ancho);
 
 abstract double calcularPerimetro(double base, double altura, double ancho);
    
}
