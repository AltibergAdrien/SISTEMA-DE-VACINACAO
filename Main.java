import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PostoDeSaude posto = new PostoDeSaude();

        while (true) {
            System.out.println("Posto de vacinação");
            System.out.println("-----------------------------------------------");
            System.out.println("");
            System.out.println("Opções: ");
            System.out.println("");
            System.out.println("1 - Marcar vacina");
            System.out.println("");
            System.out.println("2 - Desmarcar vacina");
            System.out.println("");
            System.out.println("3 - Listagem geral");
            System.out.println("");
            System.out.println("0 - Sair do programa");
            System.out.println("-----------------------------------------------");
            System.out.println("");

            System.out.println("Digite a opção desejada: ");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Encerrando programa...");
                    entrada.close();
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Digite seu RG: ");
                    String rg = entrada.next();

                    System.out.println("Informe seu nome: ");
                    String nome = entrada.next();

                    System.out.println("Informe sua idade: ");
                    int idade = entrada.nextInt();

                    System.out.println("Informe seu email: ");
                    String email = entrada.next();

                    posto.marcarVacina(rg, nome, idade, email);
                    break;
                case 2:
                    System.out.println("Informe o RG de cancelamento: ");
                    String rgCancela = entrada.next();

                    posto.cancelarMarcacao(rgCancela);
                    break;
                case 3:
                    posto.Listagem();
                    break;
                default:
                    System.out.println("Opção inválida! ");
                    break;
            }
        }
    }
}
