import java.util.Scanner;

public class palabrainvertida {
    public static void main(String args[]){
        String palabra ="", palabrainvertida ="";
        int longitudpalabra = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print(" escribe una palabra o frase: ");
        palabra = entrada.nextLine();

        longitudpalabra = palabra.length();

        while (longitudpalabra !=0) {
            palabrainvertida += palabra.substring(longitudpalabra - 1, longitudpalabra);
            longitudpalabra --;
        }
        System.out.print("palabra invertida: " + palabrainvertida);
        System.out.println("");
    }
}
