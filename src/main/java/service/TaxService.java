package service;

import comparator.TaxComparator;
import model.TaxPayer;

import java.util.List;

public class TaxService {
    public void sortTaxes(List<TaxPayer> payers){
        payers.sort(new TaxComparator());
    }

    public double calculateTotalTax(List<TaxPayer> payers){
        return payers.stream().mapToDouble(TaxPayer::calculateTax).sum();
    }
}
