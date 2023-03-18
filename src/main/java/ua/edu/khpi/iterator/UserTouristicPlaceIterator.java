package ua.edu.khpi.iterator;

import ua.edu.khpi.entity.TouristicPlace;

import java.util.ArrayList;
import java.util.List;

public class UserTouristicPlaceIterator implements TouristicPlacesIterator {

    private int currentPosition = 0;
    private List<TouristicPlace> touristicPlaces = new ArrayList<>();

    public UserTouristicPlaceIterator(List<TouristicPlace> touristicPlaces) {
        this.touristicPlaces = touristicPlaces;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < touristicPlaces.size();
    }

    @Override
    public TouristicPlace getNext() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        TouristicPlace touristicPlace = touristicPlaces.get(currentPosition);
        currentPosition++;
        return touristicPlace;
    }
}
