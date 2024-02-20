public class Dog extends Animal implements Drawable, SoundProducable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("  / \\_/ \\");
        System.out.println("/(     )\\___");
        System.out.println(" (       )   ");
        System.out.println(" (       )");
        System.out.println(" (       )    /" + "\\");
        System.out.println("  (   )    /" + " _" + "\\");
        System.out.println("   (   )  /" + " ( " + ")\\___");
    }

    @Override
    public void callSound() {
        System.out.println("Woof! Woof!");
    }
}
