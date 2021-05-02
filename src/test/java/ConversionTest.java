import org.junit.Test;
import org.porlabs.jave.common.AUDIO_FORMAT;
import org.porlabs.jave.common.BITRATE;
import org.porlabs.jave.common.Jave;
import org.porlabs.jave.common.JaveImpl;
import ws.schild.jave.Encoder;

import java.io.File;

import static org.junit.Assert.assertNotNull;

public class ConversionTest {

    private Jave jave = new JaveImpl();

    @Test
    public void testDependency() {
        assertNotNull(new Encoder());
    }

    @Test
    public void testWavToMp3() {
        try {
            String sourcePath = "/resources/sample.wav";
            String targetName = "output";
            File source = new File(sourcePath);
            this.jave.convert(source, targetName, AUDIO_FORMAT.MP3, BITRATE.BitRate_112800);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("Done"); //TODO: Remove console output
    }
}
