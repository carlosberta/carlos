public class Arreglos {
    public static void main(String[] args) {
        int[] lista = new int[10];
        lista[0] = 10;
        lista[1] = 20;

       /* for(int i=0; i<lista.length; i++)
        {
            System.out.println("lista = " + lista[i]);
        }*/
        /*for(int numero: lista) {
            if (numero != 0) {
                System.out.println("numero = " + numero);
            }else {
                break;
            }
        }
String[] palabras = {"pepe", "gaby", "maria", "ana", "estela"};

           /*for(String p: palabras)
           {
               System.out.println("p = " + p);

        }*/

        String nombre = "Gabriel";
        Integer numero = 21;

        /*if(numero instanceof Number)
        {
            System.out.println(" es un numero");
        }else {
            System.out.println(" no es un numero ");
        }*/

        String mensaje = (numero instanceof Number)? "es un numero": "no es un numero";
        System.out.println("mensaje = " + mensaje);

        mensaje = (numero==20)?"num igual a 20":"num no es igual a 20";
        System.out.println("mensaje = " + mensaje);
    }
}