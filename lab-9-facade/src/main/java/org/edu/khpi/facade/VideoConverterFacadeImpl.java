package org.edu.khpi.facade;

import org.edu.khpi.converter.VideoConverter;

import java.util.List;

public class VideoConverterFacadeImpl implements VideoConverterFacade {

    private List<VideoConverter> videoConverters;

    public VideoConverterFacadeImpl(List<VideoConverter> videoConverters) {
        this.videoConverters = videoConverters;
    }

    @Override
    public void convertVideo(String filePath, String fileName) {
        videoConverters.stream()
                .filter(videoConverter -> videoConverter.getFileFormat().equals(fileName.substring(fileName.indexOf(".") + 1)))
                .findFirst()
                .ifPresent(videoConverter -> videoConverter.convert(filePath));
    }
}
