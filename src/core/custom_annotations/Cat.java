package core.custom_annotations;

@VeryImportant
public class Cat {
    @ImportantString
    String name;

    public Cat(String name) { this.name = name; }

    @RunImmediately(time = 2)
    public void meow() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Much!");
    }
}
