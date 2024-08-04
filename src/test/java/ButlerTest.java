import org.junit.Test;
import static org.junit.Assert.*;

public class ButlerTest {

    @Test
    public void testButlerFunction() {
        Butler butler = new Butler();
        // Example method call to test
        String result = butler.someMethod();
        assertEquals("Expected Result", result);
    }
}
