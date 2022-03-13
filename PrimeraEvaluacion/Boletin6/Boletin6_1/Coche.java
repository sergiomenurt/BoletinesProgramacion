public class Coche {

        //atributos

        private int velocidade;

        //constructores

        public Coche() {
            velocidade = 0;
        }


            public int getVelocidade(){
                return velocidade;
            }
            public void acelerar(int masVelocidade){

                velocidade += masVelocidade;
            }
            public void frenar(int menosVelocidade) {

                velocidade -= menosVelocidade;
            }
        }


