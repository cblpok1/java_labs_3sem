package comparator;

import model.TaxPayer;

import java.util.Comparator;

public class TaxComparator implements Comparator<TaxPayer> {
    @Override
    public int compare(TaxPayer a1,TaxPayer a2){
        return Double.compare(a1.calculateTax(),a2.calculateTax());
    }
}
