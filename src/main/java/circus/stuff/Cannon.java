<<<<<<< HEAD:src/main/java/circus/animal/Cannon.java
package circus.animal;
=======
package circus.stuff;
>>>>>>> upstream/generics_cage:src/main/java/circus/stuff/Cannon.java

public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
