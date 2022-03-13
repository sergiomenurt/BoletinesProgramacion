package SegundaEvaluacion.Boletin20.Boletin20_2;


public class Boletin20_2 {


    public static void main(String[] args) {
        Avestruz av=new Avestruz();
        hacerCaminar(av);
        Papagaio papag=new Papagaio();
        hacerCaminar(papag);
        hacerVolar(papag);
        Morcego morc=new Morcego();
        hacerCaminar(morc);
        hacerVolar(morc);
        Gato gat=new Gato();
        hacerCaminar(gat);
        hacerNadar(gat);
        Tigre tig=new Tigre();
        hacerCaminar(tig);
        hacerNadar(tig);
    }
    public static void hacerCaminar(IPodeCaminar caminador){
        caminador.caminar();
    }
    public static void hacerVolar(IPodeVolar volador){
        volador.volar();
    }
    public static void hacerNadar(IPodeNadar nadador){
        nadador.nadar();
    }
}