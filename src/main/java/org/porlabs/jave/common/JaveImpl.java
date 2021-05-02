package org.porlabs.jave.common;

import ws.schild.jave.Encoder;
import ws.schild.jave.EncoderException;
import ws.schild.jave.MultimediaObject;


import java.io.File;

import static org.apache.commons.lang3.ObjectUtils.isEmpty;

public class JaveImpl implements Jave {
    @Override
    public void convert(final File source, final String targetName, final AudioFormat audioFormat, final BitRate bitrate) {
        try {
            if(isEmpty(source) || isEmpty(targetName) || isEmpty(audioFormat) || isEmpty(bitrate)) {
                throw new RuntimeException("Input requirement failed");
            }
            File target = new File(targetName + "." + audioFormat.format);
            new Encoder().encode(new MultimediaObject(source), target, JaveUtil.getEncodingAttributes(audioFormat, bitrate));
        } catch (EncoderException e) {
            e.printStackTrace();
            throw new RuntimeException("Input Process failed");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unexpected process failure");
        }
    }
}
