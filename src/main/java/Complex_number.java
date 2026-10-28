public class Complex_number {
    private Double ration;
    private Double complex;

    Complex_number(Double ration,Double complex){
        this.ration = ration;
        this.complex = complex;
    }

    public Complex_number sumComplex(Complex_number b){
        Complex_number c = new Complex_number( 0.0,0.0);
        c.setRation(this.getRation()+b.getRation());
        c.setComplex(this.getComplex()+b.getComplex());
        return c;
    }
    public String makeAppearance(){
        return this.getRation().toString()+"+"+this.getComplex().toString()+"i" ;
    }

    public void setRation(Double ration) {
        this.ration = ration;
    }

    public void setComplex(Double complex) {
        this.complex = complex;
    }

    public Double getRation() {
        return ration;
    }

    public Double getComplex() {
        return complex;
    }

    @Override
    public String toString(){
        return "("+makeAppearance()+")";
    }
}
