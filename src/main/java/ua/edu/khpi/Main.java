package ua.edu.khpi;

import ua.edu.khpi.entity.TouristicPlace;
import ua.edu.khpi.iterator.TouristicPlacesIterator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TouristicPlace touristicPlace = new TouristicPlace("Empire state building", 1, 1);
        TouristicPlace touristicPlace1 = new TouristicPlace("Freedom statue", 3, 10);
        TouristicPlace touristicPlace2 = new TouristicPlace("Miami Beach", 2, 2);
        TouristicPlace touristicPlace3 = new TouristicPlace("Grand Canyon", 4, 3);

        TouristicPlaceCollection touristicPlaceCollection = new TouristicPlaceCollection(Arrays.asList(touristicPlace, touristicPlace1, touristicPlace2, touristicPlace3));

        TouristicPlacesIterator touristicPlacesUserIterator = touristicPlaceCollection.getUserTouristicPlaceIterator();
        TouristicPlacesIterator touristicPlacesNavigatorIterator = touristicPlaceCollection.getNavigatorTouristicPlaceIterator();
        TouristicPlacesIterator touristicPlacesGuideIterator = touristicPlaceCollection.getGuideTouristicPlaceIterator();

        while (touristicPlacesUserIterator.hasNext()) {
            System.out.println(touristicPlacesUserIterator.getNext());
        }

//        TouristicPlace{name='Empire state building', guideRating=1, navigatorSuggestion=1}
//        TouristicPlace{name='Freedom statue', guideRating=3, navigatorSuggestion=10}
//        TouristicPlace{name='Miami Beach', guideRating=2, navigatorSuggestion=2}
//        TouristicPlace{name='Grand Canyon', guideRating=4, navigatorSuggestion=3}
        System.out.println("\n");
        while (touristicPlacesNavigatorIterator.hasNext()) {
            System.out.println(touristicPlacesNavigatorIterator.getNext());
        }
        System.out.println("\n");
//        TouristicPlace{name='Empire state building', guideRating=1, navigatorSuggestion=1}
//        TouristicPlace{name='Miami Beach', guideRating=2, navigatorSuggestion=2}
//        TouristicPlace{name='Grand Canyon', guideRating=4, navigatorSuggestion=3}
//        TouristicPlace{name='Freedom statue', guideRating=3, navigatorSuggestion=10}
        while (touristicPlacesGuideIterator.hasNext()) {
            System.out.println(touristicPlacesGuideIterator.getNext());
        }
//        TouristicPlace{name='Empire state building', guideRating=1, navigatorSuggestion=1}
//        TouristicPlace{name='Miami Beach', guideRating=2, navigatorSuggestion=2}
//        TouristicPlace{name='Freedom statue', guideRating=3, navigatorSuggestion=10}
//        TouristicPlace{name='Grand Canyon', guideRating=4, navigatorSuggestion=3}
    }
}
