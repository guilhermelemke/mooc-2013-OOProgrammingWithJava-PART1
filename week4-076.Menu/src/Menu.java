
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    // add the methods here
    public void addMeal (String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }
    public void printMeals() {
        for (String itemList : meals) {
            System.out.println(itemList);
        }
    }
    public void clearMenu() {
        meals.removeAll(meals);
    }
}
