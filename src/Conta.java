public class Conta extends Titular {
    private double saldo;

    public Conta(String nome, String cpf, String telefone,double saldo) {
        super(nome, cpf, telefone);
        this.saldo = saldo;
    }


    public void depositar(double valorDeposito){
        this.saldo = this.saldo+valorDeposito;
        System.out.println("deposito concluido");

    }

    public void sacar(double valorSaque){
        if(this.saldo < valorSaque){
            System.out.println("saldo insuficinte");
        } else {
            this.saldo = this.saldo - valorSaque;
            System.out.println("saque feito");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void fichaDaConta(){
        String msg = """
                nome: %s.
                telefone: %s,
                cpf: %s;
                saldo: %.2f
                """.formatted(this.getNome(),this.getTelefone(),this.getCpf(),this.saldo);
        System.out.println(msg);
    }

    @Override
    public void rendas() {
        double rendimento = (this.saldo*10)/100;
        System.out.println(this.saldo+"rende 10% ao mes "+ rendimento);
        super.rendas();
    }
}
