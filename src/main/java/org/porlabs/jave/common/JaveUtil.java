package org.porlabs.jave.common;

import ws.schild.jave.encode.AudioAttributes;
import ws.schild.jave.encode.EncodingAttributes;

import static org.apache.commons.lang3.ObjectUtils.isEmpty;

public class JaveUtil {
    public static EncodingAttributes getEncodingAttributes(AudioFormat audioFormat, BitRate bitRate) {
        if(isEmpty(audioFormat)) {
            throw new RuntimeException("Audio format required");
        }
        if(isEmpty(bitRate)) {
            throw new RuntimeException("Bitrate required");
        }
        //Audio Attributes
        AudioAttributes audioAttributes = new AudioAttributes();
        audioAttributes.setCodec("libmp3lame");
        audioAttributes.setBitRate(bitRate.bitRate);
        audioAttributes.setChannels(2);
        audioAttributes.setSamplingRate(44100);
        //Encoding attributes
        EncodingAttributes encodingAttributes = new EncodingAttributes();
        encodingAttributes.setOutputFormat(audioFormat.format);
        encodingAttributes.setAudioAttributes(audioAttributes);
        return encodingAttributes;
    }
}
