package restaurant_menu;

public class Pizza implements FoodItem {
	private double price = 250.0;
	private int prepTime = 15;
	private String ingredients = "Cheese, Tomato Sauce, Dough";

	public String getName() {
		return "Pizza";
	}

	public double getPrice() {
		return price;
	}

	public int getPreparationTime() {
		return prepTime;
	}

	public String getIngredients() {
		return ingredients;
	}
}
