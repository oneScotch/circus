package circus.animal;

public class Bird extends Animal {
    public String speak() {
        return "tweet tweet";
    }
    public void fly() {
        System.out.println("Whee ...");
    }
}
