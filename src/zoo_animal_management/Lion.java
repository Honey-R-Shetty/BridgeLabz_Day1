package zoo_animal_management;

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Lion roars...");
    }
}