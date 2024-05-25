package br.com.alura.CartaoAlura;

import java.util.Scanner;
/*CONTA TEM O OJBETO CARTAO INICADO DENTRO DELA EM VEZ DE HERDA, POIS QUE EM 1 OBJETO PODE TER OUTRO NELE SEM HERENÇA*/
public class Conta {
    private double saldo;
    private CartaoCredito cartao;
    Scanner leitura = new Scanner(System.in);

    public Conta(double saldoConta){
        this.saldo = saldoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public CartaoCredito getCartao() {
        return cartao;
    }

    public void depositar(double valorDepositp) {
        this.saldo = this.saldo + valorDepositp;
        System.out.printf("\n Novo Saldo: %.2f", this.saldo);
    }


    public void sacar(double valorSaque) {
        if (this.saldo < valorSaque) {
            System.out.printf("Saldo de: %.2f,Valor insuficiente!!\nValor de Saque tentado: %.2f", this.saldo, valorSaque);
        } else {
            System.out.printf("Saldo pré-saque: %.2f\nSaque Concluido!!!!\nNovo saldo: %.2f", this.saldo, (this.saldo - valorSaque));
        }
    }

    public void criarCartao() {
        int opcao;

        System.out.println("***Deseja Criar Cartao??***\n1 - SIM\n2 - NAO");
        opcao = leitura.nextInt();
        if (opcao == 1) {
            System.out.println("***Digite o limite***");
            opcao = leitura.nextInt();
            cartao = new CartaoCredito(1000);
            System.out.println("***Cartao Criado***\n***Limite: " + cartao.getLimiteCartao());
        } else {
            System.out.println("***Cartao nao criado***");

        }

    }

    public void pagarFatura(CartaoCredito cartaoCliente) {
        System.out.println("***valor fatura***\n " + cartaoCliente.faturaCartaoValor());
        System.out.println("***Deseja pagar***\n1 - SIM\n2 - NAO");
        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                if (cartaoCliente.faturaCartaoValor() > this.saldo) {
                    System.out.printf("***Fatura: %.2f***\nS***Saldo: %.2f***\nPagamento nao concluido, Saldo insuficiente***",
                            cartaoCliente.faturaCartaoValor(), this.saldo);
                } else {
                    this.saldo = this.saldo - cartaoCliente.faturaCartaoValor();
                    System.out.printf("***Fatura: %.2f\nPagamento concluido!!!***",cartaoCliente.faturaCartaoValor());
                }
                break;
            case 2:
                System.out.println("Sasindo!!!");
                break;


        }


    }


}
