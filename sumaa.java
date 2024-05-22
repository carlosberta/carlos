package Sumauno;

public class sumaa {
    private int vUno, vDos, Resultado;
    public sumaa(int Valoruno, int Valordos){
        this.vUno = Valoruno;
        this.vDos = Valordos;
    }
    public void Operacion(){
        Resultado = vUno + vDos;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("el resultado de la suma es: " + Resultado);
    }
}