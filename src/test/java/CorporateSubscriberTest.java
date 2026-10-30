import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorporateSubscriberTest {
    @Test
    public void testCorporateFeature() {
        CorporateSubscriber corp = new CorporateSubscriber("Test LLC", "A1");
        assertDoesNotThrow(() -> corp.specificCorporateFeature());
    }
}