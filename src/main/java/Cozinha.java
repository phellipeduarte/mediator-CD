public class Cozinha implements Departamento {

    private static Cozinha instancia = new Cozinha();

    public Cozinha() {}

    public static Cozinha getInstancia(){ return instancia; }

    @Override
    public String receberPedido(String pedido, Integer quarto) {
        String mensagem = "Pedido: '" + pedido + "' confirmado!" + "\n" + "Enviando para: " + quarto;
        return mensagem;
    }

    @Override
    public String receberReclamacao(String mensagem, Integer quarto) {
        String resposta = "Reclamação: '" + mensagem + "' recebida" + "\n" + "A gerência entrará em contato com o quarto " + quarto;
        return resposta;
    }
}
