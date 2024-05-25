package br.com.alura.CartaoDeCredito;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        boolean logado = true;
        List<Cliente> contasClientes = new ArrayList<>();
        Scanner opcoes = new Scanner(System.in);
        System.out.println("deseja cria a conta n bannco?\n 1 - SIM\n 2 - NAO");
        int decisao = opcoes.nextInt();
        if(decisao == 1){
           System.out.println("nome");
           String nome = opcoes.next();

           System.out.println("cpf");
           String cpf = opcoes.next();

           System.out.println("telefone");
           String telefone = opcoes.next();

           System.out.println("deposito saldo inicial");
           double saldo = opcoes.nextDouble();

           ContaAlura c1 = new ContaAlura(nome,cpf,telefone,saldo);
           contasClientes.add(c1);

        } else{
            System.out.println("obrigado! volte se mudar de opiniao");
        }

        ContaAlura contaRegistrada = (ContaAlura) contasClientes.get(0);
        while(logado == true) {
            String menu = """
                    \nBEM VINDO AO BANCO!!!
                    1 - ver saldo;
                    2 - cria cartao;
                    3 - ver compras feito no cartao;
                    4 - ver limite do cartao;
                    5 - comprar algo;
                    0 - sair
                    """;
            System.out.println(menu);
            decisao = opcoes.nextInt();

            switch (decisao) {
                case 0:
                    System.out.println("saindo da conta! Passar bem");
                    logado = false;
                    contaRegistrada = null;
                    break;

                case 1:
                    System.out.printf("o saldo é de: %.2f", contaRegistrada.getSaldo());
                    break;
                case 2:
                    contaRegistrada.criaCartao(true);
                    break;
                case 3:
                    contaRegistrada.getCartao().listaDasCompras();
                    break;
                case 4:
                    contaRegistrada.getCartao().verificarLimite();
                    break;
                case 5:
                    System.out.println("nome produto");
                    String nomeProduto = opcoes.next();

                    System.out.println("valor produto");
                    double valorProduto = opcoes.nextDouble();

                    contaRegistrada.getCartao().comprar(nomeProduto, valorProduto);
                    break;


            }
        }
     }

    }



