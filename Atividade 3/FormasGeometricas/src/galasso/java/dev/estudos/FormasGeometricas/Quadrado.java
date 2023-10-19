package galasso.java.dev.estudos.FormasGeometricas;

public class Quadrado extends Figura{
    protected int numLados;
    protected double valorLado;

    @Override
    public void calculaArea() {
        this.area = valorLado * valorLado;
    }

    @Override
    public void calculaPerimetro() {
        for (int i = numLados; i > 0 ; i--){
            this.perimetro += valorLado;
        }
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }

    @Override
    public void descricaoFinal(){
        calculaArea();
        calculaPerimetro();
        System.out.printf("A área desse quadrado é de: %scm²%n", this.area);
        System.out.printf("O perímetro desse quadrado é de:%scm%n", this.perimetro);
    }

}
