package SegundaEvaluacion.Boletin25;

import ExemploArrayObxectos.LerDatos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    FileWriter fichero;
    PrintWriter escribir;
    BufferedWriter buffer;
    Libro libro;
    Scanner sc;

    public void añadirLibro(File fich) {
        try {
            fichero = new FileWriter(fich, true);
            escribir = new PrintWriter(fichero);
            escribir.println(LerDatos.lerString("Introduce titulo") + " " + LerDatos.lerString("Introduce autor") + " " + LerDatos.lerString("Introduce precio") + " " + LerDatos.lerString("Introduce unidades"));
        } catch (IOException ex) {
            System.out.println("Error al añadir el libro" + ex.getMessage());
        } finally {
            escribir.close();
            try {
                fichero.close();
            } catch (IOException ex) {
                System.out.println("No se puede cerrar el archivo" + ex.getMessage());
            }
        }

    }

    public void consultarLibro(File fich) {
        ArrayList<Libro> lista = leerFichero(fich, " ");
        System.out.println("introduzca el titulo del libro del que quiere saber el precio");
        sc = new Scanner(System.in);
        String titulo = sc.nextLine();
        //LerDatos.lerString("titulo libro");
        boolean atopado = true;
        for (Libro l : lista) {
            if (l.getNombreLibro().equalsIgnoreCase(titulo)) {
                System.out.println("el precio del libro es: " + l.getPrecio());
                atopado = false;
                break;
            }
        }
        if (atopado) {
            System.out.println("el libro no existe");
        }
    }

    public ArrayList<Libro> leerFichero(File fich, String delimitador) {
        String cadena;
        ArrayList<Libro> lista = new ArrayList<>();
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                cadena = sc.nextLine();
                String[] linea = cadena.split(delimitador);
                libro = new Libro(linea[0], linea[1], Float.parseFloat(linea[2]), Integer.parseInt(linea[3]));
                lista.add(libro);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        } finally {
            sc.close();
        }
        return lista;
    }

    public ArrayList<Libro> borrarElemento(File fich) {
        ArrayList<Libro> lista = leerFichero(fich, " ");
        try {
            for (Libro l : lista) {
                if (l.getUnidades() == 0) {
                    lista.remove(l);
                    break;
                }
            }
            fichero = new FileWriter(fich);
            escribir = new PrintWriter(fichero);
            for (Libro l : lista) {
                escribir.println(l.getNombreLibro() + "-" + l.getAutor() + "-" + l.getPrecio() + "-" + l.getUnidades());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                fichero.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    public ArrayList<Libro> modificarPrecio(File fich) {
        ArrayList<Libro> lista = leerFichero(fich, " ");
        System.out.println("introduzca el titulo del libro del que quieras modificar el precio");
        sc = new Scanner(System.in);
        String titulo = sc.nextLine();
        boolean encontrado = true;
        try {
            System.out.println("Introduce nuevo precio");
            float precio = sc.nextFloat();
            for (Libro l : lista) {
                if (l.getNombreLibro().equalsIgnoreCase(titulo)) {
                    l.setPrecio(precio);
                    encontrado = false;
                }
                break;
            }
            fichero = new FileWriter(fich);
            escribir = new PrintWriter(fichero);
            for (Libro l : lista) {
                escribir.println(l.getNombreLibro() + " " + l.getAutor() + " " + l.getPrecio() + " " + l.getUnidades());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                fichero.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }
}