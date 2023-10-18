package galasso.dev;

public class Aluno {
    //declaração de atributos
    private String nome,matricula;
    private double  nota1, nota2, nota3, media;
    private int idade, totalNotas;
/********************************************************************/
    //declaração de métodos
    public int contaNotas(){
        return ++totalNotas;
    }

    public void exibeNotas() {
        System.out.println("Nota 1: "+getNota1());
        contaNotas();
        System.out.println("Nota 2: "+getNota2());
        contaNotas();
        System.out.println("Nota 3: "+getNota3());
        contaNotas();
    }

    public void exibeMedia(){
        media = ((nota1+nota2+nota3)/totalNotas);
        System.out.println("A média final é: "+ media);
    }

    public void resultadoAluno(){
        if(media < 6) System.out.println("Aluno Reprovado");
        else System.out.println("Aluno Aprovado");
    }
    public void dadosAluno(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("ID Aluno: "+getMatricula());
    }

/*************************************************************/
    //declaração de setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

/*************************************************************/
    //declaração de getters
    public String getNome() {
        return nome;
    }

    public double getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }
}


