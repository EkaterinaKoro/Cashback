import org.junit.jupiter.api.Test;
import ru.netology.service.Cashback;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackTest {

    @Test
    void  StatusRemainCashback0() {
        Cashback cashback = new Cashback();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }
    @Test

        public void shouldReturnRemainValue450() {
            Cashback service = new Cashback();
            int amount = 4500;
            int actual = service.remain(amount);
            int expected = 450;
            assertEquals(actual, expected);
        }


    }

}