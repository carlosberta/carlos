public class Operaciones {
    public static void main(String[] args) {
        int num_1 = 5, num_2 = 3, resultado = 0;
        int parametro = 1;
        switch (parametro) {
            case 1: resultado = num_1 + num_2;
                System.out.println("el resultado de la suma es: " + resultado);
                break;
            case 2: resultado = num_1 - num_2;
                System.out.println("el resultado de la resta es: " + resultado);
                break;
            case 3: resultado = num_1 * num_2;
                System.out.println("el resultado de la multipilcacion es: " + resultado);
                break;
            case 4: resultado = num_1 / num_2;
                System.out.println("el resultado de la division es: " + resultado);
                break;

            default:
                System.out.println("error, la opcion no existe");
                break;
        }
    }
}