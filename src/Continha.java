public class Continha extends Titular{
    private double saldo;

    public Continha(String nome, String cpf, String telefone,double saldo) {
        super(nome, cpf, telefone);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void rendas() {
        double rendimento  = (this.saldo*20)/100;
        System.out.println(this.saldo+"rende ao mes 20%"+rendimento);
        super.rendas();
    }
}
