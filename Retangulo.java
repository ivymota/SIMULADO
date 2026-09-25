package SIMULADO;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo() {

        this.largura = 1.0;
        this.altura = 1.0;
    }

    public Retangulo(double largura, double altura) {

        if(largura < 0 || altura < 0)
            System.out.println("Inicialização Inválida");
        else {

            this.largura = largura;
            this.altura = altura;
        }
    }

    public double getLargura() { return this.largura; }
    public void setLargura(double novaLargura) { 

        if(novaLargura < 0)
            System.out.println("Inicialização Inválida");
        else
            this.largura = novaLargura;
    }

    public double getAltura() { return this.altura; }
    public void setAltura(double novaAltura) {

        if(novaAltura < 0)
            System.out.println("Inicialização Inválida");
        else
            this.altura = novaAltura;
    }

    public double calcularArea() {  return this.largura * this.altura; }

    public boolean isQuadrado() {

        return (this.altura == this.largura);
    }



}
