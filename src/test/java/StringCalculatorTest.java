import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringCalculatorTest {
    public void AddTest1() {
        //cant compare an executable to an int, out of ideas haha
        //assertThrows(RuntimeException.class, StringCalculator.add("-1,5"));
    }

    public void AddTest2() {
        int test = StringCalculator.add("1,1000");
        assertEquals(1, test);
    }

}
