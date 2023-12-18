public class Movie  {
    private String title;
    private int releaseYear;
    private String distributor;

    public Movie(String title, int releaseYear, String distributor) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.distributor = distributor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "\n" + "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", distributor='" + distributor + '\'' +
                '}';
    }

}