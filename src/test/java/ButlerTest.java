import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ButlerTest {

    @Test
    public void testWelcome() {
        Butler butler = new Butler();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        butler.welcome();

        assertEquals("Hello World", outContent.toString().trim());
    }
}
