
package figurasgeometricas;

public abstract class Planas extends ClaseFiguras{
   
    //constructor
    public Planas(double base, double altura, double ancho){
    
    super.base=base;
    super.altura=altura;
    
    }

    
    @Override
    double calcularArea(double base, double altura, double ancho) {
    return base*altura;
    }

    @Override
    double calcularPerimetro(double base, double altura, double ancho) {
    return base*base;
    }
 
    abstract double calcVolumen(double base, double altura, double ancho);
    abstract double calcProfundidad(double base, double altura, double ancho);
    
}
