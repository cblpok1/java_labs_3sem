package factory;

import exception.InvalidTagException;
import model.BeneficiaryTaxPayer;
import model.RegularTaxPayer;
import model.TaxPayer;

import java.util.Locale;

public class TaxPayerFactory {
    public static TaxPayer createTaxPayer(String type,String name,double income,double addIncome,double authorReward,double propertySale,double gifts, double foreignTransfers, double childBenefits, double materialHelp,double param)
        throws InvalidTagException{
        if(name==null || name.trim().isEmpty()){
            throw new InvalidTagException("Name can't be empty");
        }
        if(income<0 || addIncome<0){
            throw new InvalidTagException("Income can't be less then zero");
        }
        switch (type.toLowerCase()){
            case "standard":
                return new RegularTaxPayer(name,income,addIncome, authorReward,propertySale,gifts,foreignTransfers,childBenefits,materialHelp,param);
            case "beneficiary":
                return new BeneficiaryTaxPayer(name,income,addIncome, authorReward,propertySale,gifts,foreignTransfers,childBenefits,materialHelp,param);
            default:
                throw new InvalidTagException("Unknown type of taxPayer:" + type);
        }
    }
}
