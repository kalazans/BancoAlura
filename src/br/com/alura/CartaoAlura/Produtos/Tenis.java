package br.com.alura.CartaoAlura.Produtos;

public class Tenis extends Items{
    private String marca;
    private String tamanho;
    private String cor;

    public Tenis(String nomeProduto, double valorProduto,String marcaProduto,String tamanhoProduto,String corProduto) {
        super(nomeProduto, valorProduto);
        this.marca = marcaProduto;
        this.tamanho = tamanhoProduto;
        this.cor = corProduto;
    }

    public String fichaProduto() {
        String msg = """
                nome: %s;
                Valor: %.2f;
                Marca: %s;
                Tamanho: %s;
                Cor: %s;
                """.formatted(this.getNome(),this.getValor(),this.marca,this.tamanho,this.cor);
        return msg;

    }
}
