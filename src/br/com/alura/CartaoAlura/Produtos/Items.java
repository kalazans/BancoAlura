package br.com.alura.CartaoAlura.Produtos;
/*ITEMS FOI CRIADO PRA USAR O ARRAY E ACEITAR TENIS E CAMISA Q HERDAM ELE, PARA TREINAR O POLYPHORMISMO*/
public class Items {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Items(String nomeProduto, double valorProduto){
        this.nome = nomeProduto;
        this.valor = valorProduto;
    }
}
