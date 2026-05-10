package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartidaMediatorTest {

    @Test
    void deveCoordenarAcoesPeloArbitro() {
        // 1. Instanciamos a "Torre de Controle" (O Mediador)
        Mediador arbitro = new ArbitroCentral();

        // 2. O Jogador entra em campo conhecendo apenas o Árbitro
        Jogador arrascaeta = new Jogador(arbitro);

        // 3. O jogador sofre falta e cai, mas ele não chama o médico, ele aciona o árbitro!
        String resultadoLesao = arrascaeta.cairComDor();
        assertEquals("Doutor acionado pelo Árbitro: Equipe Médica em campo!", resultadoLesao);

        // 4. O jogador reclama de um pênalti, o árbitro é quem aciona o VAR!
        String resultadoReclamacao = arrascaeta.reclamarFalta();
        assertEquals("VAR acionado pelo Árbitro: Revisando o lance na tela!", resultadoReclamacao);
    }
}