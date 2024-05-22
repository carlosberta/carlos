package Sumauno;
import java.util.Scanner;
public class SumaMain {
    public static void main(String args[]){

Scanner entrada = new Scanner(System.in);
        System.out.println("dame el primer valor ");
        int Valoruno = entrada.nextInt();
        System.out.println("dame el segundo valor ");
        int Valordos = entrada.nextInt();

        sumaa valores = new sumaa(Valoruno, Valordos);
        valores.Imprimir();

    }
}
