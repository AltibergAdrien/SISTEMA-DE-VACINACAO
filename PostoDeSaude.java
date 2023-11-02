import java.util.ArrayList;

public class PostoDeSaude {
    private ArrayList<Requisitos> marcacoes = new ArrayList<>();
    private ArrayList<Requisitos> filaEspera = new ArrayList<>();

    public void marcarVacina(String rg, String nome, int idade, String email) {
        if (marcacoes.size() < 10) {
            Requisitos requisitos = new Requisitos(email, nome, idade, email);
            marcacoes.add(requisitos);
            System.out.println("Marcação registrada com sucesso!");
        } else if (filaEspera.size() < 10) {
            Requisitos requisitos = new Requisitos(email, nome, idade, email);
            filaEspera.add(requisitos);
            System.out.println("Você foi adicionado à fila de espera!");
        } else {
            System.out.println("Desculpe não há vagas disponíveis");
        }
    }

    public void cancelarMarcacao(String rg) {
        for (int i = 0; i < marcacoes.size(); i++) {
            if (marcacoes.get(i).getRG() == rg) {
                marcacoes.remove(i);
                if (filaEspera.size() > 0) {
                    Requisitos proximRequisitos = filaEspera.remove(0);
                    marcacoes.add(proximRequisitos);
                    System.out.println("Vaga liberada, próximo da fila confirmado!");
                } else {
                    System.out.println("Marcação não encontrada para o RG informado! ");
                }
            }

        }
    }

    public void Listagem() {
        System.out.println("Vacinações agendadas: ");
        for (Requisitos pessoa : marcacoes) {
            System.out.println(pessoa.getNome() + " RG: " + pessoa.getRG());
        }

        System.out.println("Vacinações na fila de espera: ");
        for (Requisitos pessoa : filaEspera) {
            System.out.println(pessoa.getNome() + " RG: " + pessoa.getRG());
        }
    }

}
