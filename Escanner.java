
    import java.util.Scanner;
    public class Escanner {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            String nombre = "";
            int numUno = 0, numDos = 0, resultado = 0;
            System.out.println("cual es tu nombre?");
            nombre = entrada.nextLine();
            System.out.println("dame el primer valor para tu suma");
            numUno = entrada.nextInt();
            System.out.println("dame el segundo valor para tu suma");
            numDos = entrada.nextInt();
            resultado = numUno + numDos;
            System.out.println("hola " + nombre + " el resultado de tu suma es: " + resultado);
        }
    }