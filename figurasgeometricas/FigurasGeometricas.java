
package figurasgeometricas;

import java.util.Scanner;

public class FigurasGeometricas {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 --- Planas");
        System.out.println("2 --- Planas");
        System.out.println("3 --- Volumétricas");
        System.out.println("4 --- Volumétricas");
        System.out.println(" -----------------");
        System.out.println("Ingresa un número según tu elección: ");
        int figura = sc.nextInt();
        
        switch(figura){
        
               case 1 -> { 
               System.out.println("Ingresa base: ");
               double base = sc.nextInt();
               System.out.println("Ingresa altura: ");
               double altura = sc.nextInt();
               
               
            }
               case 2 -> { 
               System.out.println("Ingresa base: ");
               double base = sc.nextInt();
               
               
            }
               case 3 -> { 
               System.out.println("Ingresa base: ");
               double base = sc.nextInt();
               System.out.println("Ingresa altura: ");
               double altura = sc.nextInt();
               System.out.println("Ingresa ancho: ");
               double ancho = sc.nextInt();
                   
            }
               case 4 -> { 
               System.out.println("Ingresa base: ");
               double base = sc.nextInt();
               System.out.println("Ingresa altura: ");
               double altura = sc.nextInt();
               System.out.println("Ingresa ancho: ");
               double ancho = sc.nextInt();
   
            }
           
            default -> System.out.println("No es una opción válida");
        
        }      
    } 
}
