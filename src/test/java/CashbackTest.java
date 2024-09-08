import org.junit.Test;
import ru.netology.service.Cashback;

import static org.junit.Assert.assertEquals;


public class CashbackTest {

    @Test
    public void CashbackForPurchaseOf1000() {
        Cashback cashback = new Cashback();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);

    }

    @Test
    public void CashbackForPurchaseOf2000() {
        Cashback service = new Cashback();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test

    public void StatusRemainCashback3500() {
        Cashback service = new Cashback();
        int amount = 3500;
        int actual = service.remain(amount);
        int expected = 350;
        assertEquals(actual, expected);
    }

    @Test
    public void StatusRemainCashback4800() {
        Cashback service = new Cashback();
        int amount = 4800;
        int actual = service.remain(amount);
        int expected = 480;
        assertEquals(actual, expected);
    }

}