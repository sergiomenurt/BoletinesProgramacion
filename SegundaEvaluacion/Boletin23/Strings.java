package SegundaEvaluacion.Boletin23;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Strings {

    public static void main(String[] args) {
        String primero = new String("Esto e Java!");
        int longitud = primero.length();
        System.out.println("Longitud : " + longitud);

        String segundo = new String("Java");
        for (int i = 0; i < segundo.length(); i++) {
            System.out.println(segundo.charAt(i));
        }

        String tercero = new String("Java desde 0");
        StringBuilder tercerob = new StringBuilder(tercero);
        tercero = tercerob.reverse().toString();
        System.out.println(tercero);

        String cuarto = new String("James Gosling Created Xava");
        String cuartob = cuarto.replaceAll("\\s+", "");
        System.out.println(cuartob);

        String quinto = new String("java java java");
        int vocales = 0, consonantes = 0;
        quinto = quinto.toLowerCase(Locale.ROOT);
        for (int i = 0; i < quinto.length(); i++) {
            char ch = quinto.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vocales++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonantes++;
            }

        }
        System.out.println("Vocales : " + vocales);
        System.out.println("Consonantes : " + consonantes);


        String sexto = new String("www.java,desde0.com");
        //sexto.substring(9);
        String[] split = sexto.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


        String septimo = new String("javeros");
        String septimob = septimo.toUpperCase(Locale.ROOT);
        System.out.println(septimob);
        septimob = septimob.toLowerCase(Locale.ROOT);
        System.out.println(septimob);

        String octavo = new String("Java");
        String octavob = new String("Javascript");
        System.out.println(octavo.equals(octavob));

        String noveno = new String("jeve jeve jeve");
        System.out.println(noveno.replaceAll("e", "a"));

        String decimo = new String("ABCD");
        byte[] numero = decimo.getBytes(StandardCharsets.US_ASCII);
        System.out.println("ASCII Numeric Value of A: " + numero[0]);
        System.out.println("ASCII Numeric Value of B: " + numero[1]);
        System.out.println("ASCII Numeric Value of C: " + numero[2]);
        System.out.println("ASCII Numeric Value of D: " + numero[3]);

        String once = new String("Ola, son alumno de DAM1, e son programador desde o 2021");
        int letras = 0, dixitos = 0, espacios = 0;
        for (int i = 0; i < once.length(); i++) {
            char ch = once.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                letras++;
            } else if ((ch >= '0' && ch <= '9')) {
                dixitos++;
            } else if ((ch >= 'A' && ch <= 'Z')) {
                letras++;
            } else if ((ch == ' ')) {
                espacios++;
            }
        }
        System.out.println("Letras :" + letras);
        System.out.println("Díxitos :" + dixitos);
        System.out.println("Espacios :" + espacios);


    }
}