package ua.edu.khpi.iterator;

import ua.edu.khpi.entity.TouristicPlace;

public interface TouristicPlacesIterator {

    boolean hasNext();

    TouristicPlace getNext();
}
