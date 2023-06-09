public interface Departamento {

    String receberPedido(String pedido, Integer quarto);
    String receberReclamacao(String mensagem, Integer quarto);
}
