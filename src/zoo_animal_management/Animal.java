package zoo_animal_management;

abstract class Animal {
	private String name;
	private int age;
	private boolean isHealthy;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		this.isHealthy = true;
	}

	public abstract void makeSound();

	public void eat() {
		System.out.println(name + " is eating.");
	}

	public void sleep() {
		System.out.println(name + " is sleeping.");
	}

	public void showHealthStatus() {
		System.out.println(name + " health status: " + (isHealthy ? "Healthy" : "Sick"));
	}

	public void setHealth(boolean health) {
		this.isHealthy = health;
	}
}
