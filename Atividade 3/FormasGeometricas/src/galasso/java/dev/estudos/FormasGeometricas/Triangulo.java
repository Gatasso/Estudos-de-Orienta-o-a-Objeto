package galasso.java.dev.estudos.FormasGeometricas;

public class Triangulo extends Figura{
/**************************************************/
//declarando variaveis internas

    private double base,altura;
/**************************************************/
//declarando métodos

    @Override
    public void calculaArea() {
        this.area = ((base*altura)/2);
    }

    @Override
    public void descricaoFinal() {
        calculaArea();
        calculaPerimetro();
        System.out.printf("A área desse triângulo é de: %scm²%n", this.area);
        System.out.printf("O perímetro desse retângulo é de:%scm%n", this.perimetro);
    }
/*******************************************************************************************/
//declarando getters & setters

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
