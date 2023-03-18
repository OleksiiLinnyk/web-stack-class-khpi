package ua.edu.khpi.iterator;

import ua.edu.khpi.entity.TouristicPlace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NavigatorTouristicPlaceIterator implements TouristicPlacesIterator {

    private int currentPosition = 0;
    private List<TouristicPlace> touristicPlaces = new ArrayList<>();

    public NavigatorTouristicPlaceIterator(List<TouristicPlace> touristicPlaces) {
        this.touristicPlaces = touristicPlaces.stream()
                .sorted(Comparator.comparingInt(TouristicPlace::getNavigatorSuggestion))
                .collect(Collectors.toList());
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
        currentPosition ++;
        return touristicPlace;
    }
}
