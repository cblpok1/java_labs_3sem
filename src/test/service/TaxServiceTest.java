package service;

import exception.InvalidTagException;
import factory.TaxPayerFactory;
import model.TaxPayer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxServiceTest {

    @Test
    void testCalculateTotalTax() throws InvalidTagException {
        TaxService service = new TaxService();
        List<TaxPayer> list = new ArrayList<>();

        list.add(TaxPayerFactory.createTaxPayer("standard", "A", 1000, 0, 0, 0, 0, 0, 0, 0, 0.13
        ));

        list.add(TaxPayerFactory.createTaxPayer("beneficiary", "B", 1000, 0, 0, 0, 0, 0, 0, 0, 500
        ));

        double total = service.calculateTotalTax(list);

        assertEquals(630.0, total, 0.001);
    }
}