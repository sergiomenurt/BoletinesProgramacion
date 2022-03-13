package SegundaEvaluacion.Boletin24.Aplicacion;
import SegundaEvaluacion.Boletin24.Libreria.Libreria;
import SegundaEvaluacion.Boletin24.Libreria.LibroLibreria;
import LibreriaSergio.LeerDatos;
import java.util.ArrayList;


public class Aplicacion {

    public static void main(String[] args) {
        ArrayList<Libro> lista=new ArrayList<Libro>();
        int op;
        do{
            op=LeerDatos.leerInt("***MENU***\n1- Agregar Libro\n2- Vender libros\n3- Ver libros\n4- Dar libros de baja\n5- Buscar libro\n0- SALIR");
            switch(op){
                case 1 : lista=Libreria.añadir(lista);
                    break;
                case 2 : lista=Libreria.vender(lista);
                    break;
                case 3 : Libreria.amosar(lista);
                    break;
                case 4 : lista=Libreria.darBaja(lista);
                    break;
                case 5 : Libreria.buscarLibro(lista);
                    break;
                case 0 : System.out.println("Salida exitosa");
                    break;
                default: System.out.println("Opcion incorrecta");
            }
        }while(op!=0);
    }
