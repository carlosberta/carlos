import java.util.Scanner;
public class matricesDinamicas {
    public static void main(String args[]) {
        int filas = 0;
        int columnas = 0;
        int contador = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.print("cuantas filas deseas? ");
        filas = entrada.nextInt();
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("cuantas columnas deseas? ");
        columnas = entrada1.nextInt();

        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "]");
            }
            System.out.println("");
        }
    }
}