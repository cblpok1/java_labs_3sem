package factory;

import exception.InvalidTagException;
import model.BeneficiaryTaxPayer;
import model.RegularTaxPayer;
import model.TaxPayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxPayerFactoryTest {

    @Test
    void testCreateStandardTaxPayer() throws InvalidTagException {
        TaxPayer payer = TaxPayerFactory.createTaxPayer("standard", "Иван", 1000, 0, 0, 0, 0, 0, 0, 0, 0.13);

        assertNotNull(payer);
        assertTrue(payer instanceof RegularTaxPayer);
        assertEquals("Иван", payer.getName());
        assertEquals(130.0, payer.calculateTax(), 0.001);
    }

    @Test
    void testCreateBeneficiaryTaxPayer() throws InvalidTagException {
        TaxPayer payer = TaxPayerFactory.createTaxPayer("beneficiary", "Петр", 5000, 1000, 0, 0, 0, 0, 0, 0, 500);

        assertNotNull(payer);
        assertTrue(payer instanceof BeneficiaryTaxPayer);
        assertEquals(500.0, payer.calculateTax(), 0.001);
    }

    @Test
    void testInvalidNameThrowsException() {
        assertThrows(InvalidTagException.class, () -> {
            TaxPayerFactory.createTaxPayer("standard", "", 1000, 0, 0, 0, 0, 0, 0, 0, 0.13);
        });
    }

    @Test
    void testNegativeIncomeThrowsException() {
        assertThrows(InvalidTagException.class, () -> {
            TaxPayerFactory.createTaxPayer("standard", "Иван", -100, 0, 0, 0, 0, 0, 0, 0, 0.13
            );
        });
    }

    @Test
    void testUnknownTypeThrowsException() {
        assertThrows(InvalidTagException.class, () -> {
            TaxPayerFactory.createTaxPayer("unknown", "Иван", 1000, 0, 0, 0, 0, 0, 0, 0, 0.13
            );
        });
    }
}