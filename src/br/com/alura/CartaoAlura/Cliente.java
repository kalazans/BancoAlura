package br.com.alura.CartaoAlura;
/*CLIENTE HERDA CONTA*/
public class Cliente extends Conta {
    private String nome;
    private String cpf;
    private String telefone;


    public Cliente(double saldoConta,String nomeCliente,String cpfCliente,String telefoneCliente) {
        super(saldoConta);
        this.nome = nomeCliente;
        this.cpf = cpfCliente;
        this.telefone = telefoneCliente;
    }




}
