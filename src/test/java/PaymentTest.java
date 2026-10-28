

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    private Payment payment;

    @BeforeEach
    void setUp() {
        payment = new Payment();
    }

    @Test
    void testAddProductAndTotalPrice() {
        // Добавляем товары
        payment.addProduct("Книга", 100.0);
        payment.addProduct("Ручка", 50.0);

        assertEquals(150.0, payment.getTotalPrice(), "Сумма должна быть 150.0");
    }

    @Test
    void testEmptyPayment() {
        assertEquals(0.0, payment.getTotalPrice());
    }

    @Test
    void testInnerClassCreation() {
        Payment.Product product = payment.new Product("Телефон", 1000.0);

        assertNotNull(product);
        assertEquals("Телефон", product.getName());
        assertEquals(1000.0, product.getPrice());
    }

    @Test
    void testAnonymousClassDiscount() {
        payment.addProduct("Товар 1", 200.0);
        payment.addProduct("Товар 2", 300.0);

        double discountedSum = payment.calculateDiscount(10);

        assertEquals(450.0, discountedSum, 0.001, "Сумма со скидкой 10% должна быть 450.0");
    }
}