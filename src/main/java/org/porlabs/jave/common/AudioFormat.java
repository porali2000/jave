package org.porlabs.jave.common;

public enum AudioFormat {
    MP3("mp3"),
    AC3("ac3"),
    WAV("wav");
    String format;

    AudioFormat(String format) {
        this.format = format;
    }
}
