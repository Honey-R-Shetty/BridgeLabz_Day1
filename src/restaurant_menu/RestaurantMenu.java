package restaurant_menu;

import java.util.Scanner;

public class RestaurantMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodItem item = null;

		while (true) {
			System.out.println("\n---- Menu ----");
			System.out.println("1. Pizza");
			System.out.println("2. Burger");
			System.out.println("3. Pasta");
			System.out.println("4. Exit");
			System.out.print("Choose your item: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				item = new Pizza();
				break;
			case 2:
				item = new Burger();
				break;
			case 3:
				item = new Pasta();
				break;
			case 4:
				System.out.println("Thanks for visiting");
				return;
			default:
				System.out.println("Invalid choice");
				continue;
			}

			System.out.println("\n--- Item Details ---");
			System.out.println("Name: " + item.getName());
			System.out.println("Price: " + item.getPrice());
			System.out.println("Preparation Time: " + item.getPreparationTime() + " mins");
			System.out.println("Ingredients: " + item.getIngredients());
		}
	}
}
