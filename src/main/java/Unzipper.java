import org.nd4j.util.ArchiveUtils;
import java.io.File;

public class Unzipper {
    public static void main(String[] args) throws Exception {
        Butler butler = new Butler();
        butler.welcome();

        ArchiveUtils.unzipFileTo("./malicious_file.zip", "./unzipped/");
        File f = new File("/tmp/evil.txt");
        if (f.exists()) {
            throw new Exception("Malicious file /tmp/evil.txt was created");
        }
    }
}
