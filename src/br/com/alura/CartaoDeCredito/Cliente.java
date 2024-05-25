package br.com.alura.CartaoDeCredito;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;


    public String getNome() {
        return nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente){
       this.nome = nomeCliente;
       this.cpf = cpfCliente;
       this.telefone = telefoneCliente;

   }



   }



