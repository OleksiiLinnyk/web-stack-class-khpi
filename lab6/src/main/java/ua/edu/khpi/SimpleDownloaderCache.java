package ua.edu.khpi;

import java.io.File;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class SimpleDownloaderCache implements Downloader {

    private final SimpleDownloader simpleDownloader;
    private static final Long cacheExpirationInMs = 1300L;
    private final Map<String, CacheableFile> fileCache;


    public SimpleDownloaderCache(SimpleDownloader simpleDownloader) {
        this.simpleDownloader = simpleDownloader;
        fileCache = new HashMap<>();
    }

    @Override
    public File download(String fileName) {
        CacheableFile cacheableFile = fileCache.get(fileName);
        if (cacheableFile != null && ChronoUnit.MILLIS.between(cacheableFile.getTime(), LocalDateTime.now()) < cacheExpirationInMs) {
            System.out.println("File is present in cache. Getting file from cache");
            return fileCache.get(fileName).getFile();
        }
        File file = simpleDownloader.download(fileName);
        fileCache.put(fileName, new CacheableFile(file, LocalDateTime.now()));
        System.out.println("File is not cached yet or cached is expired. Cached it and return");
        return file;
    }

    private static class CacheableFile {
        private final File file;
        private final LocalDateTime time;

        private CacheableFile(File file, LocalDateTime time) {
            this.file = file;
            this.time = time;
        }

        public File getFile() {
            return file;
        }

        public LocalDateTime getTime() {
            return time;
        }
    }
}
