
package boletin5;

import java.util.Scanner;


public class Boletin5 {

    
    public static void main(String[] args) {
       
       Scanner sc= new Scanner (System.in);
        
        System.out.println("Kilómetros recorridos por el coche");
        double km = sc.nextDouble();
        
        System.out.println("Litros de combustible consumidos");
        double litros = sc.nextDouble();
        
        System.out.println("Velocidad media");
        double vMed = sc.nextDouble();
        
        System.out.println("Prezo da gasolina");
        double pGas = sc.nextDouble();
        
        
        // obxeto 1
        
        litros=50;
        pGas=1.57;
        
        Consumo obxCon1 = new Consumo();
        obxCon1.amosar("Consumo medio "+obxCon1.getConsumoMedio);
        
        //obxeto 2
        
        litros=56;
        
        Consumo obxCon2 = new Consumo();
        obxcon2.amosar("Velocidade media "+vMed);
   
        
    }
    
}
