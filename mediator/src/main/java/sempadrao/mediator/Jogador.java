package sempadrao.mediator;

public class Jogador {
    private EquipeMedica medico = new EquipeMedica();
    private CabineVAR var = new CabineVAR();

    public String sofrerLesao() {
        return medico.prestarSocorro();
    }

    public String pedirPenalti() {
        return var.analisarVideo();
    }
}