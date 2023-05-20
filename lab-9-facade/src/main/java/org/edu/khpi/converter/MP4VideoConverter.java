package org.edu.khpi.converter;

public class MP4VideoConverter implements VideoConverter {

    private static final String fileFormat = "mp4";
    @Override
    public void convert(String filePath) {
        System.out.println("Converting MP4 video file " + filePath);
    }

    @Override
    public String getFileFormat() {
        return fileFormat;
    }
}
