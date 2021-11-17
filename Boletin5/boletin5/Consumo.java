
package boletin5;


public class Consumo {
    
    // atributos
    
  
        private double km;
        private double litros;
        private double vMed;
        private double pGas;
       
    
    // metodos 
        
        double tiempo = km/vMed;
        double consumoMedio = litros/km *100;
        double consumoEuros = pGas/km *100;
        
    //constructores
        
        public Consumo() {
            
        }
        
        public Consumo(double km, double litros, double vMed, double pGas){
            
            this.km = km;
            this.litros = litros;
            this.vMed = vMed;
            this.pGas = pGas;
            
            
        }
        
        public double getTempo() {
            return km/vMed;
        }
        
        public double getConsumoMedio() {
            return (litros*100)/km;
        }
        public double getConsumoEuros() {
            return pGas/100;
        }
        
        public void setKms() {
            this.km = km;
        }
        
        public void setLitros() {
            this.litros = litros;
        }

       

        public void setVMed() {
            this.vMed = vMed;
        }

      
        
        public void setPGas() {
            this.pGas = pGas;
        }
         
        public void amosar() {
            
            System.out.println("Consumo medio: "+getConsumoMedio());
        }
        
       
}
