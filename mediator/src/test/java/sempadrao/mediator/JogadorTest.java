package sempadrao.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    @Test
    void jogadorChamaServicosDiretamente() {
        Jogador gabigol = new Jogador();

        assertEquals("Equipe Médica entra em campo com a maca!", gabigol.sofrerLesao());
        assertEquals("VAR analisando as imagens da câmera... Possível pênalti!", gabigol.pedirPenalti());
    }
}