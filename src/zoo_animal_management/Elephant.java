package zoo_animal_management;

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Elephant trumpets!");
    }
}