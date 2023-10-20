package primeiroexercicio;

import primeiroexercicio.estudos.br.com.github.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        //pedindo ao usuário fornecer dados iniciais
        System.out.println("""
            Informe seu nome:\s
            Informe sua idade:\s
            Informe seu peso:\s
            Informe sua altura:
            Informe o sexo:     \s
                """);

        //lendo os dados
        pessoa1.setNome(scanner.next());
        pessoa1.setIdade(scanner.nextInt());
        pessoa1.setPeso(scanner.nextDouble());
        pessoa1.setAltura(scanner.nextDouble());
        pessoa1.setSexo(scanner.next());

        //exibindo a informação
        pessoa1.fichaTecnica();
        scanner.close();
    }

}
