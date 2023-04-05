public class Earth {

    public static void main(String[] args) {
      Human tom;
      tom  = new Human();
      tom.age = 5;
      tom.heightInInches = 80;
      tom.eyeColor = "blue";
      tom.name = "Tom Hossain";

        Human Shoaib = new Human("Shoaib", 24, 90, "piercing-brown");

      tom.speak();
        System.out.println("\n\n");

        Shoaib.speak();
    }
}
