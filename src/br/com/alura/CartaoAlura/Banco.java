package br.com.alura.CartaoAlura;
import br.com.alura.CartaoAlura.Produtos.Camisa;
import br.com.alura.CartaoAlura.Produtos.Tenis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//PROJETO BASICO PRA TREINO, MESMO SE ADIOCIONAR OUTRAS CONTAS SÓ VAI PEGA O DA POSIÇAO (0) NO ARRAY//
public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String menu = """
                \n************************
                0 - SAIR
                1 - DEPOSITAR;
                2 - SACAR;
                3 - CRIA CARTAO;
                4 - COMPRAR NO CARTAO;
                5 - FATURA CARTAO;
                6 - VERIFICAR LIMITE;
                7 - PAGAR FATURA
                8 - SALDO CONTA;
                ************************
                """;
        boolean logado = true;
        List<Cliente> listaClientes = new ArrayList<>();
        System.out.println("***\nBem vindo\nCadastro novo Cliente?\n1 SIM\n2 NAO\n***");
        int opcao = leitura.nextInt();

        if(opcao == 1){
            String nome,cpf,telefone;
            double saldo;
            System.out.println("nome");
            nome = leitura.next();
            System.out.println("cpf");
            cpf = leitura.next();
            System.out.println("telefone");
            telefone = leitura.next();
            System.out.println("Saldo");
            saldo = leitura.nextDouble();

            Cliente c1i = new Cliente(saldo,nome,cpf,telefone);
            listaClientes.add(c1i);

            System.out.println("cliente casdastrato!");

        } else {
            System.out.println("Volte se mudar de ideia!");
        }

        while(logado == true){
            System.out.println(menu);
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("digite valor do deposito");
                    double saldo = leitura.nextDouble();
                    listaClientes.get(0).depositar(saldo);
                    System.out.println("\n***Deposito Concluido***");
                    break;

                case 2:
                    System.out.println("***valor do saque***");
                    double saque = leitura.nextDouble();
                    listaClientes.get(0).sacar(saque);
                   break;

                case 3:
                    listaClientes.get(0).criarCartao();
                    break;

                case 4:
                    System.out.println("nome produto");
                    String nomeProduto  = leitura.next();
                    if(nomeProduto.equals("camisa")) {
                        System.out.println("valor produto");
                        double valorProduto = leitura.nextDouble();
                        System.out.println("Marca produto");
                        String marcaProduto = leitura.next();
                        System.out.println("Tamanho produto");
                        String tamanhoProduto = leitura.next();
                        System.out.println("Cor produto");
                        String corProduto = leitura.next();

                        Camisa camisa = new Camisa(nomeProduto,valorProduto,marcaProduto,tamanhoProduto,corProduto);
                        listaClientes.get(0).getCartao().comprarNoCartao(camisa);
                    } else if(nomeProduto.equals("tenis")){
                        System.out.println("valor produto");
                        double valorProduto = leitura.nextDouble();
                        System.out.println("Marca produto");
                        String marcaProduto = leitura.next();
                        System.out.println("Tamanho produto");
                        String tamanhoProduto = leitura.next();
                        System.out.println("Cor produto");
                        String corProduto = leitura.next();

                        Tenis tenis = new Tenis(nomeProduto,valorProduto,marcaProduto,tamanhoProduto,corProduto);
                        listaClientes.get(0).getCartao().comprarNoCartao(tenis);
                    } else{
                        System.out.println("Produto nao aceito");
                    }
                    break;
                case 5:
                    listaClientes.get(0).getCartao().faturaCartao();
                    break;
                case 6:
                    listaClientes.get(0).getCartao().verificarLimite();
                    break;
                case 7:
                    listaClientes.get(0).pagarFatura(listaClientes.get(0).getCartao());
                    break;
                case 8:
                    System.out.println("Saldo na Conta: "+listaClientes.get(0).getSaldo());
                case 0:
                    System.out.println("***Saindo do Banco! Obrigado!");
                    logado = false;
                    break;
                default:
                    System.out.println("escolhe dentrs as opçoes mostradas");



            }

        }

    }
}
