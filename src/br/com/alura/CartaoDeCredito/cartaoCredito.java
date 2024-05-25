package br.com.alura.CartaoDeCredito;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class cartaoCredito {
    private double limiteCartao;
    private double saldoCartao;
    private Map<String,Double> comprasNoCartao  = new HashMap<>();

    public cartaoCredito(double limiteCartao){
        this.limiteCartao = limiteCartao;
        this.saldoCartao = limiteCartao;

    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void comprar(String produto, double valorProduto){
        comprasNoCartao.put(produto,valorProduto);
        this.saldoCartao = this.saldoCartao - valorProduto;

        String msg = """
                *****************
                COMPRA EFETUADA!
                PRODUTO: %s;
                VALOR: %.2f;
                ****************
                """.formatted(produto,valorProduto);
        System.out.println(msg);
    }

    public void  listaDasCompras(){
        for(String produto : comprasNoCartao.keySet()){
            System.out.printf("Produto: %s ->  valor: %.2f\n",produto,comprasNoCartao.get(produto));

        }
    }

    public void verificarLimite(){
        double valorTotalCompras = 0;
        for(String produto : comprasNoCartao.keySet() ){
            valorTotalCompras += comprasNoCartao.get(produto);
        }
        if(valorTotalCompras > limiteCartao){
            System.out.printf("limite estouro, vlor usado no cartao: %.2f",valorTotalCompras);
        } else {
            System.out.printf("Ainda tem limite %n Limite disponivel %.2f",(this.limiteCartao - this.saldoCartao));
        }
    }
}
