package model;

public class Film {
    private String title;
    private String description;
    private String release_year;
    private String length;
    private String rating;
    private String category;

    public Film(String title, String description, String release_year, String length, String rating, String name) {
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.length = length;
        this.rating = rating;
        this.category = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return category;
    }

    public void setName(String name) {
        this.category = name;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", release_year='" + release_year + '\'' +
                ", length='" + length + '\'' +
                ", rating='" + rating + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
