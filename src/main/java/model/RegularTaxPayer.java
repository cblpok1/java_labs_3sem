package model;

public class RegularTaxPayer extends TaxPayer{
    private double taxRate;

    public RegularTaxPayer(String name,double income,double addIncome,double authorReward,double propertySale,double gifts, double foreignTransfers, double childBenefits, double materialHelp, double taxRate){
        super(name,income,addIncome,authorReward,propertySale,gifts,foreignTransfers,childBenefits,materialHelp);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateTax(){
        return(getIncome()+getAddIncome())*taxRate;
    }
}
