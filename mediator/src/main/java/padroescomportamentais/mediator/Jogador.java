package padroescomportamentais.mediator;

public class Jogador {
    private Mediador arbitro;

    public Jogador(Mediador arbitro) {
        this.arbitro = arbitro;
    }

    public String cairComDor() {
        return arbitro.receberNotificacao("Lesao");
    }

    public String reclamarFalta() {
        return arbitro.receberNotificacao("Reclamacao");
    }
}