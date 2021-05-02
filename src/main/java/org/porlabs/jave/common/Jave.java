package org.porlabs.jave.common;

import java.io.File;

public interface Jave {
    void convert(File source, String targetName, AUDIO_FORMAT audioFormat, BITRATE bitrate);
}
