package ua.edu.khpi.builder;

public interface Builder {

    Builder select(String select);

    Builder where(String where);

    Builder limit(Integer limir);

    //getSQL
    String build();
}
