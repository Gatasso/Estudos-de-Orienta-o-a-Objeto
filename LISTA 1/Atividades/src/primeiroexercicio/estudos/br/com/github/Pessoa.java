package primeiroexercicio.estudos.br.com.github;

public class Pessoa {
    private String nome, sexo;
    private int idade;
    private double altura, peso;

    public void fichaTecnica(){
        System.out.println("Olá "+getNome()+ ". Você tem " + getIdade()+" anos."); //imprimindo os dados iniciais
        System.out.printf("Você pesa %.2f kg, e mede %.0f cm. Sexo: %s%n",getPeso(), getAltura(), getSexo());
    }
 
    public void setNome(String nome){
        this.nome = nome; 
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
}

