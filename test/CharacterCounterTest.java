import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharacterCounterTest {
    @Test
    void CounterStringAReturnOne() throws Exception{
        CharacterCounter counter = new CharacterCounter("A");
        int counterA = counter.count('A');
        Assertions.assertEquals(1, counterA);
    }

    @Test
    void CountStringAAReturnTwo() throws Exception{
        CharacterCounter counter = new CharacterCounter("AA");
        int counterAA = counter.count('A');
        Assertions.assertEquals(2, counterAA);
    }

    @Test
    void CountStringAAReturnsZeroForB() throws Exception{
        CharacterCounter counter = new CharacterCounter("AA");
        int countB = counter.count('B');
        Assertions.assertEquals(0, countB);
    }
}

