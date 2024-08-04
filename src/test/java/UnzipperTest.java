import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class UnzipperTest {

    @Test
    public void testMain() throws Exception {
        // Call the main method of Unzipper
        String[] args = {};
        try {
            Unzipper.main(args);

            // Check if the malicious file is created
            File f = new File("/tmp/evil.txt");
            assertFalse("Malicious file should not exist", f.exists());
        } finally {
            // Clean up the created file if it exists
            File f = new File("/tmp/evil.txt");
            if (f.exists()) {
                f.delete();
            }
        }
    }
}
