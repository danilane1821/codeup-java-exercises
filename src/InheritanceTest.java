public class InheritanceTest {
    public static void main(String[] args) {
        Animal cat = new Animal(2,"feline",false);
        System.out.println(cat.getAge());
        System.out.println(cat.getSpecies());
        System.out.println(cat.isAlive());


        Dog dog = new Dog(2,"pug", true,"pug","bud");
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
    }
}
