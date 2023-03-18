package ua.edu.khpi.entity;

public class TouristicPlace {

    private String name;
    private int guideRating;
    private int navigatorSuggestion;

    public TouristicPlace() {
    }

    public TouristicPlace(String name, int guideRating, int navigatorSuggestion) {
        this.name = name;
        this.guideRating = guideRating;
        this.navigatorSuggestion = navigatorSuggestion;
    }

    public int getGuideRating() {
        return guideRating;
    }

    public void setGuideRating(int guideRating) {
        this.guideRating = guideRating;
    }

    public int getNavigatorSuggestion() {
        return navigatorSuggestion;
    }

    public void setNavigatorSuggestion(int navigatorSuggestion) {
        this.navigatorSuggestion = navigatorSuggestion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TouristicPlace{" +
                "name='" + name + '\'' +
                ", guideRating=" + guideRating +
                ", navigatorSuggestion=" + navigatorSuggestion +
                '}';
    }
}
