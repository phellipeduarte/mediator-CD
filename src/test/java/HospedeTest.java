import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedeTest {
    Hospede hospede;

    @BeforeEach
    void setUp(){
        hospede = new Hospede("Phellipe", 505);
    }

    @Test
    void deveReceberPedidoCozinha(){

        String resposta = hospede.fazerPedidoCozinha("Fricassê de Frango");
        String respostaEsperada =
                "Pedido feito: Fricassê de Frango" + "\n" +
                "Pedido: 'Fricassê de Frango' confirmado!" + "\n" +
                "Enviando para: 505";

        assertEquals(respostaEsperada, resposta);
    }

    @Test
    void deveReceberReclamacaoCozinha(){

        String resposta = hospede.fazerReclamacaoCozinha("Fricassê veio frio");
        String respostaEsperada =
                "Reclamação feita: Fricassê veio frio" + "\n" +
                "Reclamação: 'Fricassê veio frio' recebida" + "\n" +
                "A gerência entrará em contato com o quarto 505" ;

        assertEquals(respostaEsperada, resposta);
    }

    @Test
    void deveReceberPedidoFinanceiro(){

        String resposta = hospede.fazerPedidoFinanceiro("Cama extra no quarto");
        String respostaEsperada =
                "Pedido feito: Cama extra no quarto" + "\n" +
                "Pedido: 'Cama extra no quarto' solicitado" + "\n" +
                "Solicitado por: 505";

        assertEquals(respostaEsperada, resposta);
    }

    @Test
    void deveReceberReclamacaoFinanceiro(){

        String resposta = hospede.fazerReclamacaoFinanceiro("Valor incorreto cobrado");
        String respostaEsperada =
                "Reclamação feita: Valor incorreto cobrado" + "\n" +
                "Reclamação: 'Valor incorreto cobrado' recebida" + "\n" +
                "A gerência entrará em contato com o quarto 505";

        assertEquals(respostaEsperada, resposta);
    }
}
