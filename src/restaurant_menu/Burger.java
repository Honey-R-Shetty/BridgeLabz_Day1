package restaurant_menu;

public class Burger implements FoodItem {

	private double price = 150.0;
	private int prepTime = 10;
	private String ingredients = "Bun, Patty, Lettuce";

	public String getName() {
		return "Burger";
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
