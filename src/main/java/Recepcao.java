public class Recepcao {

    private static Recepcao instancia = new Recepcao();

    private Recepcao() {}

    public static Recepcao getInstancia(){ return instancia; }

    public String receberPedidoCozinha(String pedido, Integer quarto){
        String mensagem = "Pedido feito: " + pedido + "\n" + Cozinha.getInstancia().receberPedido(pedido, quarto);
        return mensagem;
    }

    public String receberReclamacaoCozinha(String mensagem, Integer quarto){
        String resposta = "Reclamação feita: " + mensagem + "\n" + Cozinha.getInstancia().receberReclamacao(mensagem, quarto);
        return resposta;
    }

    public String receberPedidoFinanceiro(String pedido, Integer quarto){
        String mensagem = "Pedido feito: " + pedido + "\n" + Financeiro.getInstancia().receberPedido(pedido, quarto);
        return mensagem;
    }

    public String receberReclamacaoFinanceiro(String mensagem, Integer quarto){
        String resposta = "Reclamação feita: " + mensagem + "\n" + Financeiro.getInstancia().receberReclamacao(mensagem, quarto);
        return resposta;
    }
}
