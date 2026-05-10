package padroescomportamentais.mediator;

public class ArbitroCentral implements Mediador {
    // O Árbitro centraliza as comunicações
    private EquipeMedica equipeMedica = new EquipeMedica();
    private CabineVAR var = new CabineVAR();

    @Override
    public String receberNotificacao(String evento) {
        if (evento.equalsIgnoreCase("Lesao")) {
            return equipeMedica.entrarEmCampo();
        } else if (evento.equalsIgnoreCase("Reclamacao")) {
            return var.revisarLance();
        }
        return "Árbitro manda o jogo seguir.";
    }
}