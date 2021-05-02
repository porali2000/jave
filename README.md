# `jave v1.0` from `porlabs`

## Java Lib to convert audio files


### Release Notes
#### v 1.0
- Audio Convertor

#### Usage:
        String sourcePath = "/src/test/resources/sample.mp3";
        String targetName = "output";
        File source = new File(sourcePath);
        this.jave.convert(source, targetName, AudioFormat.WAV, BitRate.BitRate_112800);
