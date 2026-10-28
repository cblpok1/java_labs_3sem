import java.util.ArrayList;

public class Polinom {

    private ArrayList<Complex_number> coeff;

    public Polinom(){
        this.coeff = new ArrayList<>();
    }

    public Polinom(ArrayList<Complex_number> a){
        this.coeff = new ArrayList<>(a);
    }

    public void addCoeff(Complex_number c){
        this.coeff.add(c);
    }
    public void print(String s){
        System.out.print(s+" = ");
        if(coeff.isEmpty()){
            System.out.println("0");
            return;
        }
        for(int i = 0;i<coeff.size();i++){
            System.out.println(coeff.get(i));
            if(i>0) System.out.println("x^"+i+" + ");
        }
        System.out.println();
    }

    public Polinom add(Polinom sec){
        Polinom res = new Polinom();

        int s1 = this.coeff.size();
        int s2 = sec.coeff.size();
        int maxS = (s1>s2)?s1:s2;

        for(int i = 0;i<maxS;i++){
            Complex_number c1 = (i< s1)?this.coeff.get(i):new Complex_number(0.0,0.0);
            Complex_number c2 = (i< s2)?sec.coeff.get(i):new Complex_number(0.0,0.0);

            res.addCoeff(c1.sumComplex(c2));
        }
        return res;
    }

    public ArrayList<Complex_number> getCoeff() {
        return coeff;
    }
}
