import java.util.ArrayList;
import java.util.List;

public class city {
    private String name;
    private List<recommendation> recommendations;

    public city(String name) {
        this.name = name;
        this.recommendations = new ArrayList<>();
    }

    public String getname() {
        return name;
    }

    public void addrecommendation(recommendation recommendation) {
        recommendations.add(recommendation);
    }

    public void displayall(String category) {
        System.out.println("\n" + name.toUpperCase() + " - " + category.toUpperCase() + "S");
        int index = 1;
        for (recommendation recommendation : recommendations) {
            if (recommendation.getClass().getSimpleName().equalsIgnoreCase(category)) {
                System.out.println(index + ". " + recommendation.getname());
                recommendation.displayinfo();
                index++;
            }
        }
    }
}



