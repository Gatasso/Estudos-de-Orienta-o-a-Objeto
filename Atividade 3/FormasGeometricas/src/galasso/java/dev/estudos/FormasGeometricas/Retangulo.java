package galasso.java.dev.estudos.FormasGeometricas;

public class Retangulo extends Quadrado{
/**************************************************/
//declarando variaveis internas

    private double comprimento, altura;
/**************************************************/
//declarando métodos

    @Override
    public void calculaArea() {
        this.area = comprimento * altura;
    }

    @Override
    public void calculaPerimetro() {
        for (int i = numLados; i >2 ; i--){
            this.perimetro += (comprimento + altura);
        }
    }

    @Override
    public void descricaoFinal() {
        calculaArea();
        calculaPerimetro();
        System.out.printf("A área desse retângulo é de: %scm²%n", this.area);
        System.out.printf("O perímetro desse retângulo é de:%scm%n", this.perimetro);
    }
/*******************************************************************************************/
//declarando getters & setters

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
