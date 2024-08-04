import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class UnzipperTest {

    @Test
    public void testMain() throws Exception {
        String[] args = {};
        Unzipper.main(args);

        File f = new File("/tmp/evil.txt");
        assertFalse("Malicious file should not exist", f.exists());
    }
}
