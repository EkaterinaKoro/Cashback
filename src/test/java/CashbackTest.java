import org.testng.annotations.Test;
import ru.netology.service.Cashback;

import static org.junit.jupiter.api.Assertions.assertEquals;



class CashbackTest {

    @Test
    public void StatusRemainCashback1000() {
        Cashback cashback = new Cashback();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }


}
