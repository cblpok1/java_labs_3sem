import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PolinomTest {

    private static final double EPS = 1e-9;

    @Test
    public void testComplexNumberAddition() {
        Complex_number num1 = new Complex_number(2.5, 4.0);
        Complex_number num2 = new Complex_number(1.5, -2.0);

        Complex_number result = num1.sumComplex(num2);

        assertEquals(4.0, result.getRation(), EPS);
        assertEquals(2.0, result.getComplex(), EPS);
    }

    @Test
    public void testMakeAppearanceFormat() {
        Complex_number num = new Complex_number(5.0, 3.5);
        assertEquals("5.0+3.5i", num.makeAppearance());
    }

    @Test
    public void testPolynomialAdditionDifferentDegrees() {
        Polinom p1 = new Polinom();
        p1.addCoeff(new Complex_number(1.0, 2.0));
        p1.addCoeff(new Complex_number(0.0, 1.0));

        Polinom p2 = new Polinom();
        p2.addCoeff(new Complex_number(2.0, -1.0));
        p2.addCoeff(new Complex_number(1.0, 0.0));
        p2.addCoeff(new Complex_number(3.0, 3.0));

        Polinom sumResult = p1.add(p2);
        ArrayList<Complex_number> coeffs = sumResult.getCoeff();

        assertEquals(3, coeffs.size());

        assertEquals(3.0, coeffs.get(0).getRation(), EPS);
        assertEquals(1.0, coeffs.get(0).getComplex(), EPS);

        assertEquals(1.0, coeffs.get(1).getRation(), EPS);
        assertEquals(1.0, coeffs.get(1).getComplex(), EPS);

        assertEquals(3.0, coeffs.get(2).getRation(), EPS);
        assertEquals(3.0, coeffs.get(2).getComplex(), EPS);
    }

    @Test
    public void testEmptyPolynomialAddition() {
        Polinom p1 = new Polinom();
        Polinom p2 = new Polinom();

        Polinom sum = p1.add(p2);

        assertTrue(sum.getCoeff().isEmpty());
    }
}
