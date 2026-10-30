import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IndividualSubscriberTest {
    @Test
    public void testIndividualLifecycle() {
        IndividualSubscriber sub = new IndividualSubscriber("Test User", "MTS");
        sub.signContract("123");
        sub.openAccountAndNumber();
        sub.topUpBalance(100);
        assertTrue(sub.getActualInfo().contains("Test User"));
        sub.closeAccountAndNumber();
        assertEquals(AccountStatus.CLOSED, sub.getStatus());
    }
}