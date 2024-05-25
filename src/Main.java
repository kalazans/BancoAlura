import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titular> contas = new ArrayList<>();
        Conta c1 = new Conta("b","120","155",200);
        contas.add(c1);
        c1.depositar(500);
        c1.fichaDaConta();

        Titular q = new Conta("b","1204","666",50);
        Conta l = (Conta) q;
        l.fichaDaConta();



        Continha c2 =  new Continha("a","987","147",500);




        contas.add(c2);

        double mSaldo=0;
        for(Titular item : contas){


            if(item instanceof Conta j ){
                j.rendas();
                mSaldo = j.getSaldo();
                System.out.print(j+"saldo"+mSaldo);
            } else if(item instanceof Continha ){
                Continha k = (Continha) item;
                k.rendas();
                if(k.getSaldo() > mSaldo){
                    System.out.println(k+"tem maior saldo");

                }
            } else {
                System.out.print("nada");
            }
        }
        Collections.sort(contas);
        System.out.println(contas);
        contas.sort(Comparator.comparing(Titular::getCpf));
        System.out.println(contas);



    }
}
