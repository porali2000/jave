import org.junit.Test;
import org.porlabs.jave.common.AudioFormat;
import org.porlabs.jave.common.BitRate;
import org.porlabs.jave.common.Jave;
import org.porlabs.jave.common.JaveImpl;
import ws.schild.jave.Encoder;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConversionTest {

    private Jave jave = new JaveImpl();

    @Test
    public void testDependency() {
        assertNotNull(new Encoder());
    }

    @Test
    public void testWavToMp3() {
        try {
            String sourcePath = "/src/test/resources/sample.wav";
            String targetName = "output";
            File source = new File(sourcePath);
            this.jave.convert(source, targetName, AudioFormat.MP3, BitRate.BitRate_112800);
        } catch (Exception e) {
            e.printStackTrace();
            fail("WavToMp3 failed");
        }
    }

    @Test
    public void testMp3ToWav() {
        try {
            String sourcePath = "/src/test/resources/sample.mp3";
            String targetName = "output";
            File source = new File(sourcePath);
            this.jave.convert(source, targetName, AudioFormat.WAV, BitRate.BitRate_112800);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Mp3ToWav failed");
        }
    }

    @Test
    public void testMp3ToAc3() {
        try {
            String sourcePath = "/src/test/resources/sample.mp3";
            String targetName = "output";
            File source = new File(sourcePath);
            this.jave.convert(source, targetName, AudioFormat.AC3, BitRate.BitRate_112800);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Mp3ToAc3 failed");
        }
    }
}
