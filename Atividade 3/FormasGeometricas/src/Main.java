import galasso.java.dev.estudos.FormasGeometricas.Quadrado;
import galasso.java.dev.estudos.FormasGeometricas.Retangulo;
import galasso.java.dev.estudos.FormasGeometricas.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
            quadrado.setNumLados(4);
        Retangulo retangulo = new Retangulo();
            retangulo.setNumLados(4);
        Triangulo triangulo = new Triangulo();

        System.out.println("Informe o valor do lado do quadrado(cm)");
            quadrado.setValorLado(scanner.nextDouble());
        System.out.println("Informe o valor do comprimento do retângulo(cm)");
            retangulo.setComprimento(scanner.nextDouble());
        System.out.println("Informe o valor da altura do retângulo(cm)");
            retangulo.setAltura(scanner.nextDouble());
        System.out.println("Informe o valor da base do triângulo(cm)");
            triangulo.setBase(scanner.nextDouble());
        System.out.println("Informe o valor da altura do triângulo(cm)");
            triangulo.setAltura(scanner.nextDouble());

        quadrado.descricaoFinal();
        retangulo.descricaoFinal();
        triangulo.descricaoFinal();

    }
}