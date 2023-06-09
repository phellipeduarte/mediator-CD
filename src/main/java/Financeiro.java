public class Financeiro implements Departamento {

    private static Financeiro instancia = new Financeiro();

    public Financeiro() {}

    public static Financeiro getInstancia() { return instancia; }

    @Override
    public String receberPedido(String pedido, Integer quarto) {
        String mensagem = "Pedido: '" + pedido + "' solicitado" + "\n" + "Solicitado por: " + quarto;
        return mensagem;
    }

    @Override
    public String receberReclamacao(String mensagem, Integer quarto) {
        String resposta = "Reclamação: '" + mensagem + "' recebida" + "\n" + "A gerência entrará em contato com o quarto " + quarto;
        return resposta;
    }
}
