package org.edu.khpi.converter;

public class AVIVideoConverter implements VideoConverter {

    private static final String FILE_FORMAT = "avi";
    @Override
    public void convert(String filePath) {
        System.out.println("Converting AVI video file " + filePath);
    }

    @Override
    public String getFileFormat() {
        return FILE_FORMAT;
    }
}
