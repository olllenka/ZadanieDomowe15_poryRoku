import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SesonUtils sesonUtils = new SesonUtils();

        System.out.println("Podaj nazwę pory roku, dostępne opcje to: ");
        sesonUtils.showAvailableSeasons();
        String userSeason = sc.nextLine();
        sesonUtils.showMonths(userSeason);
    }
}
