package SegundaEvaluacion.Boletin25;

import javax.swing.*;
import java.io.File;

public class Boletin25 {

    public static void main(String[] args) {

        Metodos libreria = new Metodos();
        File fichero = new File("libreria.txt");
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1. Añadir \n2. Consultar \n3. Visualizar \n4. Borrar \n5. Modificar precio"));
        do {
            switch (menu) {
                case 1:
                    libreria.añadirLibro(fichero);
                    break;
                case 2:
                    libreria.consultarLibro(fichero);
                    break;
                case 3:
                    libreria.leerFichero(fichero, " ");
                    break;
                case 4:
                    libreria.borrarElemento(fichero);
                    break;
                case 5:
                    libreria.modificarPrecio(fichero);
                    break;

            }
        } while (menu < 6);
    }
}