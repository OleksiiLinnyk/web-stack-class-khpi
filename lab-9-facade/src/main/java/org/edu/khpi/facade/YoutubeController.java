package org.edu.khpi.facade;

import org.edu.khpi.api.YoutubeApi;
import org.edu.khpi.converter.AVIVideoConverter;
import org.edu.khpi.converter.MP4VideoConverter;

import java.util.Arrays;

public class YoutubeController {

    private VideoConverterFacade videoConverterFacade = new VideoConverterFacadeImpl(Arrays.asList(new AVIVideoConverter(), new MP4VideoConverter()));

    private ApiFacade apiFacade = new ApiFacadeImpl(new YoutubeApi());

    public void doVideConversion(String filePath, String fileName) {
        videoConverterFacade.convertVideo(filePath, fileName);
    }

    public void doApiCall(String apiKey, String request) {
        apiFacade.doRequest(apiKey, request);
    }
}
