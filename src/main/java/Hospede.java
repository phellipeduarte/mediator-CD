public class Hospede {

    private String nome;
    private Integer quarto;

    public Hospede(String nome, Integer quarto) {
        this.nome = nome;
        this.quarto = quarto;
    }

    public String fazerPedidoCozinha(String pedido){
        return Recepcao.getInstancia().receberPedidoCozinha(pedido, this.quarto);
    }

    public String fazerPedidoFinanceiro(String pedido){
        return Recepcao.getInstancia().receberPedidoFinanceiro(pedido, this.quarto);
    }

    public String fazerReclamacaoCozinha(String mensagem){
        return Recepcao.getInstancia().receberReclamacaoCozinha(mensagem, this.quarto);
    }

    public String fazerReclamacaoFinanceiro(String mensagem){
        return Recepcao.getInstancia().receberReclamacaoFinanceiro(mensagem, this.quarto);
    }
}
