public class Sistema {
    public static void initialMenu() {
        System.out.println("""
            Bem vindo à interface do aluno
            Digite seu nome ou sua matrícula para continuar:
                """);
    }

    public static void mainMenu() {
        System.out.println("""
            Bem vindo(a)
            1 - Consultar notas
            2 - Consultar resultado
            3 - Consultar dados pessoais
            4 - Voltar
            """);
    }
}
