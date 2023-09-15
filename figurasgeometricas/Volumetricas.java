
package figurasgeometricas;


public abstract class Volumetricas extends Planas{
    
    public Volumetricas(double base, double altura, double ancho){
        
        super(base, altura, ancho);
    }   

    @Override
    double calcVolumen(double base, double altura, double ancho) {
     return base*altura*ancho;
    }

    @Override
    double calcProfundidad(double base, double altura, double ancho) {
     return ((base*altura)/2)*((1/3)*altura);
    }

}