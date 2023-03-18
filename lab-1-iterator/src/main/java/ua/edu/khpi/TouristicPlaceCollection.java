package ua.edu.khpi;

import ua.edu.khpi.entity.TouristicPlace;
import ua.edu.khpi.iterator.GuideTouristicPlacesIterator;
import ua.edu.khpi.iterator.NavigatorTouristicPlaceIterator;
import ua.edu.khpi.iterator.TouristicPlacesIterator;
import ua.edu.khpi.iterator.UserTouristicPlaceIterator;

import java.util.List;

public class TouristicPlaceCollection implements TouristicPlaceIterable {

    private final List<TouristicPlace> touristicPlaces;

    public TouristicPlaceCollection(List<TouristicPlace> touristicPlaces) {
        this.touristicPlaces = touristicPlaces;
    }

    public void add(TouristicPlace place) {
        touristicPlaces.add(place);
    }

    public TouristicPlace get(int index) {
        return touristicPlaces.get(index);
    }

    public void remove(TouristicPlace touristicPlace) {
        touristicPlaces.remove(touristicPlace);
    }

    @Override
    public TouristicPlacesIterator getUserTouristicPlaceIterator() {
        return new UserTouristicPlaceIterator(touristicPlaces);
    }

    @Override
    public TouristicPlacesIterator getNavigatorTouristicPlaceIterator() {
        return new NavigatorTouristicPlaceIterator(touristicPlaces);
    }

    @Override
    public TouristicPlacesIterator getGuideTouristicPlaceIterator() {
        return new GuideTouristicPlacesIterator(touristicPlaces);
    }
}
