package br.com.alura.CartaoDeCredito;
import java.util.Scanner;
public class ContaAlura extends Cliente{
    private double saldo;
    private cartaoCredito cartao;

    public cartaoCredito getCartao() {
        return cartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaAlura(String nomeCliente, String cpfCliente, String telefoneCliente, double saldo) {
        super(nomeCliente, cpfCliente, telefoneCliente);
        this.saldo = saldo;
    }

    public void depositar(double saldoParaDeposito){
        this.saldo = this.saldo+saldoParaDeposito;
        System.out.printf("novo saldo: %.2f",this.saldo);
    }

    public void sacar(double saqueDaConta){
        if(this.saldo < saqueDaConta){
            System.out.printf(" %.2f é Saldo insuficinete ao saque de %.2f",this.saldo,saqueDaConta);
        } else {
            this.saldo = this.saldo - saqueDaConta;
            System.out.printf("saque de %.2f concluido, NOVO SALDO: %.2f",saqueDaConta,this,saldo);
        }
    }

    public void criaCartao(boolean decisao){
        if(decisao == true){
            Scanner leitura = new Scanner(System.in);
            System.out.println("limite do cartao");
            double limiteCartao = leitura.nextDouble();

            this.cartao = new cartaoCredito(limiteCartao);

            System.out.printf("cartao criado com sucesso!!!! limite de %.2f",this.cartao.getLimiteCartao());

        } else if(cartao != null){
            System.out.print("esta conta ja tem 1 cartao");

        }
    }
}
