package ua.edu.khpi;

import java.io.File;

public class SimpleDownloader implements Downloader {

    @Override
    public File download(String fileName) {
        System.out.println("Download file with file name - " + fileName);
        return new File(String.format("/%s", fileName));
    }
}
