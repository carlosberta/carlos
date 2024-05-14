import java.util.Scanner;
public class iniciodeSesion {
    public static void main(String args[]) {
        String usuario = "", contraseña = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingresa tu nombre de usuario: ");
        usuario = entrada.nextLine();

        System.out.print("ingresa tu contraseña: ");
        contraseña = entrada.nextLine();

        if (usuario.equals("ernesto") && contraseña.equals("123456")) {
            System.out.println("inicio de sesion correcto");
        } else {
            System.out.println("nombre de usuario o contraseña incorrecto");
        }
    }
}