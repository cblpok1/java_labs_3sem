package model;

public class BeneficiaryTaxPayer extends TaxPayer{
    private double fixedTax;

    public BeneficiaryTaxPayer(String name,double income,double addIncome,double authorReward,double propertySale,double gifts, double foreignTransfers, double childBenefits, double materialHelp,double fixedTax){
        super(name,income,addIncome,authorReward,propertySale,gifts,foreignTransfers,childBenefits,materialHelp);
        this.fixedTax = fixedTax;
    }

    @Override
    public double calculateTax(){
        return fixedTax;
    }
}
