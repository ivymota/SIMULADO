package SIMULADO;

public class MainRetangulo {

    public static void main (String[] args) {

        Retangulo a = new Retangulo(5.0, 5.0);

        System.out.println("Área: " + a.calcularArea());

        if(a.isQuadrado())
            System.out.println("É quadrado");
        else
            System.out.println("Não é quadrado"); 
    }

}
