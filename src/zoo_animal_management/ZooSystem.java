package zoo_animal_management;

public class ZooSystem {
	public static void main(String[] args) {
		Lion lion = new Lion("Honey", 5);
		Elephant elephant = new Elephant("Jaya", 10);
		Monkey monkey = new Monkey("Mani", 3);

		lion.eat();
		lion.makeSound();
		lion.sleep();
		lion.showHealthStatus();

		System.out.println();

		elephant.makeSound();
		elephant.setHealth(false);
		elephant.showHealthStatus();

		System.out.println();

		monkey.sleep();
		monkey.makeSound();
		monkey.eat();
	}
}
