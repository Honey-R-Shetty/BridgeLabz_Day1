package zoo_animal_management;

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Monkey screeches!");
    }
}