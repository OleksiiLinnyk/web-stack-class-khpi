package khpi;

public class Main {

    public static void main(String[] args) {
        Downloader simpleDownloadFile = new SimpleDownloader();
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

    /**
     *
     * LOGS
     *
     * SIMPLE DOWNLOADER >>>>>>>>>>>>>>>>>>>>>>>
     * Download file with file name - test.txt
     * CACHE DOWNLOADER FIRST TIME >>>>>>>>>>>>>>>>>>>>>>>
     * Download file with file name - test.txt
     * File is not cached yet or cached is expired. Cached it and return
     * CACHE DOWNLOADER SECOND TIME >>>>>>>>>>>>>>>>>>>>>>>
     * File is present in cache. Getting file from cache
     * CACHE DOWNLOADER THIRD TIME >>>>>>>>>>>>>>>>>>>>>>>
     * AFTER EXPIRATION TIME >>>>>>>>>>>>>>>>>>>>>>>
     * Download file with file name - test.txt
     * File is not cached yet or cached is expired. Cached it and return
     */
}
