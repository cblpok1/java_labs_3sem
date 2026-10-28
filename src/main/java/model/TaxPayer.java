package model;

public abstract class TaxPayer {
    private String name;
    private double income;
    private double addIncome;
    private double authorReward;
    private double propertySale;
    private double gifts;
    private double foreignTransfers;
    private double childBenefits;
    private double materialHelp;

    public TaxPayer(String name,double income,double addIncome,double authorReward,double propertySale,double gifts, double foreignTransfers, double childBenefits, double materialHelp){
        this.income = income;
        this.name = name;
        this.addIncome = addIncome;
        this.authorReward = authorReward;
        this.propertySale = propertySale;
        this.gifts = gifts;
        this.foreignTransfers = foreignTransfers;
        this.childBenefits = childBenefits;
        this.materialHelp = materialHelp;
    }

    public String getName() {
        return name;
    }

    public double getAddIncome() {
        return addIncome;
    }

    public double getIncome() {
        return income;
    }

    public double getAuthorReward() {
        return authorReward;
    }

    public double getForeignTransfers() {
        return foreignTransfers;
    }

    public double getGifts() {
        return gifts;
    }

    public double getPropertySale() {
        return propertySale;
    }

    public double getChildBenefits() {
        return childBenefits;
    }

    public double getMaterialHelp() {
        return materialHelp;
    }

    public double getTotalIncome(){
        return income+addIncome+authorReward+propertySale+gifts+foreignTransfers;
    }

    public double getTotalBenefits(){
        return childBenefits+materialHelp;
    }
    public abstract double calculateTax();

    @Override
    public String toString(){
        return String.format("%s (Доход: %.2f, Льготы: %.2f, Налог: %.2f)",name,getTotalIncome(),getTotalBenefits(),calculateTax());
    }
}
