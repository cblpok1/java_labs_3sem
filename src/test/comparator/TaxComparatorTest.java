package comparator;

import exception.InvalidTagException;
import factory.TaxPayerFactory;
import model.TaxPayer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxComparatorTest {

    @Test
    void testCompareTaxes() throws InvalidTagException {

        TaxPayer p1 = TaxPayerFactory.createTaxPayer("beneficiary", "A", 0, 0, 0, 0, 0, 0, 0, 0, 500);
        TaxPayer p2 = TaxPayerFactory.createTaxPayer("standard", "B", 1000, 0, 0, 0, 0, 0, 0, 0, 0.13);
        TaxPayer p3 = TaxPayerFactory.createTaxPayer("standard", "C", 2000, 0, 0, 0, 0, 0, 0, 0, 0.10);
        List<TaxPayer> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Collections.sort(list, new TaxComparator());

        assertEquals("B", list.get(0).getName()); // 130
        assertEquals("C", list.get(1).getName()); // 200
        assertEquals("A", list.get(2).getName()); // 500
    }
}