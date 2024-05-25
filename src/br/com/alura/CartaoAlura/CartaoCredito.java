package br.com.alura.CartaoAlura;
import br.com.alura.CartaoAlura.Produtos.*;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limiteCartao;
    private double saldoCartao;
    private List<Items> comprasNoCartao = new ArrayList<>();
    Scanner leitura = new Scanner(System.in);

    public CartaoCredito(double limiteCartao){
        this.limiteCartao = limiteCartao;
        this.saldoCartao = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldoCartao() {
        return saldoCartao;
    }

    public void comprarNoCartao(Items produto){
        if(produto instanceof Camisa c ){

            System.out.println("***Produto correto***\n 1 - SIM\n 2 - NAO");
            int opcao = leitura.nextInt();
            if(opcao == 1) {
                System.out.println("***compra efetuada***");
                this.saldoCartao = this.saldoCartao - c.getValor();
                comprasNoCartao.add(c);
                System.out.println(c.fichaProduto());
            } else {
                System.out.println("***compra nao realizada***");
            }

        } else if(produto instanceof  Tenis t){

            System.out.println("***Produto correto?***\n1 - SIM\n2 - NAO");
            int opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("***compra efetuada***");
                this.saldoCartao = this.saldoCartao - t.getValor();
                comprasNoCartao.add(t);
                System.out.println(t.fichaProduto());
            }

        } else {
            System.out.println("Produto nao aceito!!!");
        }
    }

    public void faturaCartao(){
        double valorFatura = 0;
        for(Items produto : comprasNoCartao){
            if(produto instanceof Camisa c){
               System.out.println(c.fichaProduto());
                valorFatura = valorFatura + c.getValor();
            } else if(produto instanceof  Tenis t){
                System.out.println(t.fichaProduto());

                valorFatura = valorFatura + t.getValor();
            }
        }
        System.out.printf("\n***Fatura Total: %.2f***",valorFatura);
    }

    public double faturaCartaoValor() {
        double valorFatura = 0;
        for (Items produto : comprasNoCartao) {
            if (produto instanceof Camisa c) {

                valorFatura = valorFatura + c.getValor();
            } else if (produto instanceof Tenis t) {

                valorFatura = valorFatura + t.getValor();
            }
        }
        return valorFatura;
    }



    public void verificarLimite(){
        double valorCompras = 0;
        for(Items produto : comprasNoCartao){
            if(produto instanceof Camisa c){
                valorCompras = valorCompras + c.getValor();
            } else if(produto instanceof  Tenis t){
                valorCompras = valorCompras + t.getValor();
            }
        }

        if(valorCompras > this.limiteCartao) {
            System.out.printf("***Saldo explodido***\nValor das Compras: %.2f",valorCompras);
        } else {
            System.out.printf("***Saldo disponiviel: %.2f***\n",this.saldoCartao);
        }

    }




}
