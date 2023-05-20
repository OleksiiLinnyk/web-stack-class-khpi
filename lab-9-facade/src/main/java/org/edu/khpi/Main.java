package org.edu.khpi;

import org.edu.khpi.facade.YoutubeController;

public class Main {
    public static void main(String[] args) {
        YoutubeController youtubeController = new YoutubeController();

        youtubeController.doVideConversion("/path/to/file", "myFile.avi");
        youtubeController.doVideConversion("/path/to/file", "myFile.mp4");

//        Converting AVI video file /path/to/file
//        Converting MP4 video file /path/to/file

        youtubeController.doApiCall("Some api key", "Add a video");

//        QUERY 'Add a video' to https://youtube.com with API key 'Some api key'
    }
}
