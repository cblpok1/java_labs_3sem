import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountInfoTest {
    @Test
    public void testInfoFormatting() {
        IndividualSubscriber sub = new IndividualSubscriber("Zvankovich", "Life");
        sub.signContract("1");
        sub.openAccountAndNumber();
        String info = AccountInfo.format(sub);
        assertTrue(info.contains("Zvankovich"));
        assertTrue(info.contains("Life"));
    }
}