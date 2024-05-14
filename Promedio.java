public class Promedio {
    public static void main(String args[]) {
        int Matematica = 10;
        int Biologia = 2;
        int Quimica = 8;
        int Promedio = 0;
        Promedio = (Matematica + Biologia + Quimica)  /  3;
        System.out.println(Promedio);
        if (Promedio >= 6) {
            System.out.println(" el alumno aprobo " + Promedio);
        } else {
            System.out.println(" el alumno reprobo " + Promedio);
        }
    }
}