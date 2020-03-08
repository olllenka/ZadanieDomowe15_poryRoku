import java.util.Arrays;

public class SesonUtils {

    public void showAvailableSeasons() {
        for (Season season: Season.values()) {
            System.out.println(season.getPolishName());
        }
    }

    public void showMonths(String userSeason) {
        String[] months = getMonths(userSeason);
        String monthsString = Arrays.toString(months);
        System.out.println("Miesiące wchodzące w skład pory roku: " + userSeason + " to " + monthsString);
    }

    private String[] getMonths(String userSeason) {
        for (Season season: Season.values()) {
            if(season.getPolishName().toLowerCase().equals(userSeason.toLowerCase()))
                return season.getMonths();
        }
        return new String[0];
    }
}
