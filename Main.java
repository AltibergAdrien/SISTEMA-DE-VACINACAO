import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //LISTAS
        int[] vagasVacinacao = new int[9];
        int[] cadastrarRG = new int[9];
        int[] cadastrarIdade = new int[9];
        String[] cadastrarNome = new String[9];
        String[] cadastrarEmail = new String[9];

        //OBJETOS
        Requisitos requisitos = new Requisitos();

        //CONTADORES
        int contarVagas=0;
        int contador = 0;
        int contCadastro = 0;
        do {
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
                    contador = 1;
                    break;
                case 1:
                if(contarVagas == vagasVacinacao.length){
                    System.out.println("Não há vagas para vacinação!");
                    //Adicionar sistema de espera
                }else{
                    System.out.println("Digite seu RG: ");
                   
                }


                break;

                default:
                    System.out.println("Opção inválida! ");
                    break;
            }
        } while (contador < 1);
    }
}
