package ua.edu.khpi;

public class Main {

    public static void main(String[] args) {
        SimpleDownloader simpleDownloadFile = new SimpleDownloader();
        System.out.println("SIMPLE DOWNLOADER >>>>>>>>>>>>>>>>>>>>>>>");
        simpleDownloadFile.download("test.txt");
        Downloader downloadWithCache = new SimpleDownloaderCache(simpleDownloadFile);
        System.out.println("CACHE DOWNLOADER FIRST TIME >>>>>>>>>>>>>>>>>>>>>>>");
        downloadWithCache.download("test.txt");
        try {
            System.out.println("CACHE DOWNLOADER SECOND TIME >>>>>>>>>>>>>>>>>>>>>>>");
            downloadWithCache.download("test.txt");
            Thread.sleep(1500);
            System.out.println("CACHE DOWNLOADER THIRD TIME >>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("AFTER EXPIRATION TIME >>>>>>>>>>>>>>>>>>>>>>>");
            downloadWithCache.download("test.txt");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
