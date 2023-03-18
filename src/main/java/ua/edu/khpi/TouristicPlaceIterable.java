package ua.edu.khpi;

import ua.edu.khpi.iterator.TouristicPlacesIterator;

public interface TouristicPlaceIterable {

    TouristicPlacesIterator getUserTouristicPlaceIterator();

    TouristicPlacesIterator getNavigatorTouristicPlaceIterator();

    TouristicPlacesIterator getGuideTouristicPlaceIterator();

}
