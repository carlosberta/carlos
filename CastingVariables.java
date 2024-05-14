public class CastingVariables {
    public static void main(String[] args) {

        String numberStr = "50";
        String numberStr2 = "10";

        int num = Integer.parseInt(numberStr);
        int num2 = Integer.parseInt(numberStr2);
        int res = num2 + num;

        System.out.println("la suma es = " + res);

        String realrStr = "50.25";
        double real = Double.parseDouble(realrStr);
        System.out.println("real = " + real);

        Integer numeroInteger = 110;
        String StrNumero = Integer.toString(numeroInteger);
        System.out.println("StrNumero = " + StrNumero);

        String caracter = "A";
        char c = caracter.charAt(0);
        System.out.println("c = " + c);

        int i = 200;
        short s = (short) i;
        System.out.println("s = " + s);
        System.out.println(Short.MAX_VALUE);
    }
}
