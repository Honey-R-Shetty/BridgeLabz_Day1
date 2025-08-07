package restaurant_menu;

class Pasta implements FoodItem {
	private double price = 200.0;
	private int prepTime = 12;
	private String ingredients = "Pasta, Sauce, Cheese";

	public String getName() {
		return "Pasta";
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

