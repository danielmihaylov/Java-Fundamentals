package JavaOOPBasic.Inheritance.onlineRadioDatabase;

public class Song {
    private String artistName;
    private String name;
    private int minutes;
    private int seconds;


    public Song(String artistName, String name, int minutes, int seconds) {
        this.setArtistName(artistName);
        this.setName(name);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {

        if (artistName.length() < 3 || artistName.length() > 20){
            System.out.println("Artist name should be between 3 and 20 symbols.");
        }
        this.artistName = artistName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() < 3 || name.length() >30){
            System.out.println("Song name should be between 3 and 30 symbols.");

        }
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes <0 || minutes >14){
            System.out.println("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds <0||seconds>59){
            System.out.println("Song seconds should be between 0 and 59.");

        }
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
}
