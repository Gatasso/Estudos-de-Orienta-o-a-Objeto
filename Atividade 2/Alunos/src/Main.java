import galasso.dev.Aluno;
import galasso.dev.Sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int comandoMenu = 0;
        Scanner scanner = new Scanner(System.in);
        Aluno aluno001 = new Aluno();
            aluno001.setIdade(21);
            aluno001.setMatricula("001");
            aluno001.setNota1(0);
            aluno001.setNota2(5);
            aluno001.setNota3(7);
        Sistema.initialMenu();
        aluno001.setNome(scanner.next());
        while(comandoMenu != 4) {
            Sistema.mainMenu();
            comandoMenu = scanner.nextInt();
            switch (comandoMenu) {
                case 1:
                    aluno001.exibeNotas();
                    aluno001.exibeMedia();
                    break;
                case 2:
                    aluno001.exibeMedia();
                    aluno001.resultadoAluno();
                    break;
                case 3:
                    aluno001.dadosAluno();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Operação inválida, tente novamente.");
            }
        }
    }
}