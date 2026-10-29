package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveEnviarElogio() {
        Cliente c = new Cliente();
        assertEquals("A Central agradece seu contato.\nO Suporte respondeu sua demanda conforme mensagem a seguir.\n>>O Suporte agradece a mensagem: Atendimento excelente", c.elogiarSuporte("Atendimento excelente"));
    }

    @Test
    void deveEnviarReclamacao() {
        Cliente c = new Cliente();
        assertEquals("A Central agradece seu contato.\nO Suporte respondeu sua demanda conforme mensagem a seguir.\n>>O Suporte vai procurar melhorar o serviço da reclamação: Demora no atendimento", c.reclamarSuporte("Demora no atendimento"));
    }

    @Test
    void deveEnviarSugestao() {
        Cliente c = new Cliente();
        assertEquals("A Central agradece seu contato.\nO Suporte respondeu sua demanda conforme mensagem a seguir.\n>>O Suporte vai analisar a sugestão: Criar atendimento aos sábados", c.sugerirSuporte("Criar atendimento aos sábados"));
    }
}
