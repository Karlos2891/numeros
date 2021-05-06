package numeros;

import java.util.Scanner;

public class Numeros {

    //String[][] numeros;
    static int numero;

    public static void main(String[] args) {
        preguntar();
    }

    static void preguntar() {
        System.out.println("Introduzca un número entero:");
        try {
            Scanner entradaEscaner = new Scanner(System.in);
            numero = Integer.parseInt(entradaEscaner.nextLine());
            concatenar();
        } catch (Exception e) {
            System.out.println("Solo números enteros, intantalo de nuevo");
            preguntar();
        }
    }

    static void concatenar() {
        //declaramos las variables que vamos a imprimir
        String fila[] = new String[5];
        fila[0] = "";
        fila[1] = "";
        fila[2] = "";
        fila[3] = "";
        fila[4] = "";
        //convertimos el entero a texto
        String numeroString = Integer.toString(numero);
        //convertimos el string en arreglo
        char[] caracteres = numeroString.toCharArray();
        //sacamos la cantidad de letras
        int x = numeroString.length();
        //creamos un bucle para imprimir el resultado
        for (int i = 0; x > i; i++) {
            for (int y = 0; 5 > y; y++) {
                int num = Character.getNumericValue(caracteres[i]);
                fila[y] = fila[y] + "   " + numeros(num, y);
            }
        }

        System.out.println(fila[0]);
        System.out.println(fila[1]);
        System.out.println(fila[2]);
        System.out.println(fila[3]);
        System.out.println(fila[4]);
    }

    private static String numeros(int num, int fila) {
        String respuesta = "";
        switch (num) {
            case 0:
                switch (fila) {
                    case 0, 4:
                        respuesta = "#####";
                        break;
                    case 1, 2, 3:
                        respuesta = "#   #";
                        break;
                }
                break;

            case 1:
                switch (fila) {
                    case 0, 2, 3:
                        respuesta = "  #  ";
                        break;
                    case 1:
                        respuesta = " ##  ";
                        break;
                    case 4:
                        respuesta = "#####";
                        break;
                }
                break;
            case 2:
                switch (fila) {
                    case 0, 2, 4:
                        respuesta = "#####";
                        break;
                    case 1:
                        respuesta = "    #";
                        break;
                    case 3:
                        respuesta = "#    ";
                        break;
                }
                break;
            case 3:
                switch (fila) {
                    case 0, 2, 4:
                        respuesta = "#####";
                        break;
                    case 1, 3:
                        respuesta = "    #";
                        break;
                }
                break;
            case 4:
                switch (fila) {
                    case 0, 1:
                        respuesta = "#   #";
                        break;
                    case 2:
                        respuesta = "#####";
                        break;
                    case 3, 4:
                        respuesta = "    #";
                        break;
                }
                break;
            case 5:
                switch (fila) {
                    case 0, 2, 4:
                        respuesta = "#####";
                        break;
                    case 1:
                        respuesta = "#    ";
                        break;
                    case 3:
                        respuesta = "    #";
                        break;
                }
                break;
            case 6:
                switch (fila) {
                    case 0, 2, 4:
                        respuesta = "#####";
                        break;
                    case 1:
                        respuesta = "#    ";
                        break;
                    case 3:
                        respuesta = "#   #";
                        break;
                }
                break;
            case 7:
                switch (fila) {
                    case 0:
                        respuesta = "#####";
                        break;
                    case 1:
                        respuesta = "    #";
                        break;
                    case 2, 3, 4:
                        respuesta = "   # ";
                        break;
                }
                break;
            case 8:
                switch (fila) {
                    case 0, 2, 4:
                        respuesta = "#####";
                        break;
                    case 1, 3:
                        respuesta = "#   #";
                        break;
                }
                break;
            case 9:
                switch (fila) {
                    case 0, 2, 4:
                        respuesta = "#####";
                        break;
                    case 1:
                        respuesta = "#   #";
                        break;
                    case 3:
                        respuesta = "    #";
                        break;
                }
                break;
        }
        return respuesta;
    }

}
