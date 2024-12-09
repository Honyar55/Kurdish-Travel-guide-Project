import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        city erbil = new city("erbil");
        erbil.addrecommendation(new hotel("rotana erbil", "gulan street, erbil, iraq", 4.8, 120));
        erbil.addrecommendation(new hotel("divan erbil", "60m street, erbil, iraq", 4.7, 115));
        erbil.addrecommendation(new hotel("erbil international hotel", "ainkawa road, erbil, iraq", 4.6, 110));
        erbil.addrecommendation(new restaurant("naranj", "100m street, erbil, iraq", 4.7, "kurdish"));
        erbil.addrecommendation(new restaurant("shandiz erbil", "gulan street, erbil, iraq", 4.8, "persian & kurdish"));
        erbil.addrecommendation(new restaurant("kebaba erbil", "citadel area, erbil, iraq", 4.6, "kurdish"));
        erbil.addrecommendation(new place("erbil citadel", "erbil city center, erbil, iraq", "ancient historical site"));
        erbil.addrecommendation(new place("sami abdul-rahman park", "60m road, erbil, iraq", "largest park in erbil"));
        erbil.addrecommendation(new place("kurdish textile museum", "citadel area, erbil, iraq", "museum showcasing kurdish culture"));
        erbil.addrecommendation(new activity("city tour", "tour through the main attractions of erbil", 3));
        erbil.addrecommendation(new activity("food tasting tour", "explore local kurdish cuisine", 4));
        erbil.addrecommendation(new activity("hiking tours", "guided hiking tours to surrounding mountains", 5));

        city sulaymaniyah = new city("sulaymaniyah");
        sulaymaniyah.addrecommendation(new hotel("grand millennium", "salim street, sulaymaniyah, iraq", 4.7, 110));
        sulaymaniyah.addrecommendation(new hotel("ramada sulaymaniyah", "main street, sulaymaniyah, iraq", 4.6, 100));
        sulaymaniyah.addrecommendation(new hotel("copthorne hotel", "bakrajo road, sulaymaniyah, iraq", 4.5, 95));
        sulaymaniyah.addrecommendation(new restaurant("dawa 2", "mawlawi street, sulaymaniyah, iraq", 4.6, "kurdish & middle eastern"));
        sulaymaniyah.addrecommendation(new restaurant("top o’ the hill", "goizha mountain road, sulaymaniyah, iraq", 4.8, "fusion"));
        sulaymaniyah.addrecommendation(new restaurant("city center restaurant", "city center mall, sulaymaniyah, iraq", 4.7, "international"));
        sulaymaniyah.addrecommendation(new place("amna suraka", "sulaymaniyah city center, iraq", "former prison turned into museum"));
        sulaymaniyah.addrecommendation(new place("goizha mountain", "outskirts of sulaymaniyah", "famous mountain viewpoint"));
        sulaymaniyah.addrecommendation(new place("sulaymaniyah museum", "city center, sulaymaniyah, iraq", "largest museum in iraqi kurdistan"));
        sulaymaniyah.addrecommendation(new activity("mountain hiking", "guided tours to goizha mountain", 5));
        sulaymaniyah.addrecommendation(new activity("museum tour", "guided tour of amna suraka and the museum", 4));
        sulaymaniyah.addrecommendation(new activity("cultural experience", "visit cultural centers and kurdish workshops", 4));

        city duhok = new city("duhok");
        duhok.addrecommendation(new hotel("parleman hotel", "zaxo street, duhok, iraq", 4.4, 80));
        duhok.addrecommendation(new hotel("jiyan hotel", "azadi street, duhok, iraq", 4.5, 90));
        duhok.addrecommendation(new hotel("mountain view hotel", "mountain road, duhok, iraq", 4.3, 70));
        duhok.addrecommendation(new restaurant("khan aumina", "city center, duhok, iraq", 4.6, "kurdish"));
        duhok.addrecommendation(new restaurant("narin cafe", "main street, duhok, iraq", 4.5, "international"));
        duhok.addrecommendation(new restaurant("sharya restaurant", "sharya district, duhok, iraq", 4.7, "kurdish & middle eastern"));
        duhok.addrecommendation(new place("zawita", "duhok outskirts, iraq", "picturesque village with waterfalls"));
        duhok.addrecommendation(new place("dam of duhok", "near duhok city", "popular tourist site with scenic views"));
        duhok.addrecommendation(new place("mosul gate", "duhok city center", "ancient gate from the assyrian era"));
        duhok.addrecommendation(new activity("boat rides", "boat rides near the duhok dam", 4));
        duhok.addrecommendation(new activity("cultural night", "experience kurdish dance and music", 5));
        duhok.addrecommendation(new activity("explore zawita", "guided tours through the zawita village", 3));

        List<city> cities = List.of(erbil, sulaymaniyah, duhok);

        while (true) {
            System.out.println("\nChoose a city to explore:");
            for (int i = 0; i < cities.size(); i++) {
                System.out.println((i + 1) + ". " + cities.get(i).getname());
            }
            System.out.println((cities.size() + 1) + ". Exit");

            int choice = scanner.nextInt();
            if (choice == cities.size() + 1) break;

            if (choice > 0 && choice <= cities.size()) {
                city selectedcity = cities.get(choice - 1);

                while (true) {
                    System.out.println("\nChoose a category:");
                    System.out.println("1. Hotels");
                    System.out.println("2. Restaurants");
                    System.out.println("3. Places");
                    System.out.println("4. Activities");
                    System.out.println("5. Go back");
                    System.out.println("6. Exit");

                    int categoryChoice = scanner.nextInt();

                    switch (categoryChoice) {
                        case 1: selectedcity.displayall("hotel"); break;
                        case 2: selectedcity.displayall("restaurant"); break;
                        case 3: selectedcity.displayall("place"); break;
                        case 4: selectedcity.displayall("activity"); break;
                        case 5: break;
                        case 6: System.out.println("Exiting the program. Goodbye!"); return;
                        default: System.out.println("Invalid choice."); break;
                    }

                    if (categoryChoice == 5) break;
                }
            } else {
                System.out.println("Invalid choice. Please select a valid city.");
            }
        }

        scanner.close();
    }
}






