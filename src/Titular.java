public class Titular  implements Comparable<Titular>{
    private String nome;
    private String cpf;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Titular(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }

    public void rendas(){
        System.out.println("rende muito");
    }

    @Override
    public int compareTo(Titular outro) {
        return this.getNome().compareTo(outro.getNome());
    }

    @Override
    public String toString() {
        return this.getNome() +", "+this.getCpf();
    }
}
