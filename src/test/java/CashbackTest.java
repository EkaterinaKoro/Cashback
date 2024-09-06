import org.junit.Test;
import ru.netology.service.Cashback;

import static org.junit.Assert.assertEquals;


public class CashbackTest {

    @Test
    public void StatusRemainCashback0() {
        Cashback cashback = new Cashback();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void StatusRemainCashback450() {
        Cashback service = new Cashback();
        int amount = 4500;
        int actual = service.remain(amount);
        int expected = 450;
        assertEquals(actual, expected);
    }

    @Test

    public void StatusRemainCashback56() {
        Cashback service = new Cashback();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 56;
        assertEquals(actual, expected);
    }

    @Test
    public void StatusRemainCashback60() {
        Cashback service = new Cashback();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 60;
        assertEquals(actual, expected);
    }

}