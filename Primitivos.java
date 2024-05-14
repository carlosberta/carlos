public class Primitivos {
    public static void main(String[] args) {
        byte numero = 127;
        System.out.println("numero = " + numero);
        System.out.println(" Cuantos BYTES tiene un Byte = " + Byte.BYTES );
        System.out.println(" Cuantos BYTES tiene un Bites = " + Byte.SIZE);
        System.out.println(" Maximo valor del tipo de dato = " + Byte.MAX_VALUE );
        System.out.println(" Minimo valor del tipo de dato = " + Byte.MIN_VALUE );

        short numShort = 3000;
        System.out.println("numShort = " + numShort);
        System.out.println(" Cuantos Short tiene un Byte = " + Short.BYTES );
        System.out.println(" Cuantos Short tiene un Bites = " + Short.SIZE);
        System.out.println(" Maximo valor del tipo de dato = " + Short.MAX_VALUE );
        System.out.println(" Minimo valor del tipo de dato = " + Short.MIN_VALUE );

        float numReal = 2.0f;
        System.out.println("numReal = " + numReal);
        System.out.println(" Cuantos Float tiene un Byte = " + Float.BYTES );
        System.out.println(" Cuantos Float tiene un Bites = " + Float.SIZE);
        System.out.println(" Maximo valor del tipo de dato = " + Float.MAX_VALUE );
        System.out.println(" Minimo valor del tipo de dato = " + Float.MIN_VALUE );

        var numVar = 12;
    }
}
