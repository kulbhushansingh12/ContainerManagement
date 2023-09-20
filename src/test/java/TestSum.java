import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestSum {
    Test t;
    @BeforeEach
    public void setup() {
        t = new Test();
    }
    @org.junit.jupiter.api.Test
    public void TestSum() {
        Assertions.assertEquals(5, t.sum(2, 3));
    }
}
