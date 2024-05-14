public class Ciclofor {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++ ) {
            System.out.print(i + ", ");
        }
        int r = 1;
        while (r < 10){
            System.out.print(r + ",");
            r+=2;
        }
        int g = 1000;
        do{
            System.out.print(g + ",");
            g -= 200;
        }while(g>=0);
    }
}