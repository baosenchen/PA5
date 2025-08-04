import java.util.Random;

public class Leopard extends Critter {
    private Random rand = new Random();

    public Leopard() {
        super("Leopard");
    }

    public Direction getMove() {
        int n = rand.nextInt(4);
        if (n == 0) return Direction.NORTH;
        if (n == 1) return Direction.SOUTH;
        if (n == 2) return Direction.EAST;
        return Direction.WEST;
    }

    public Attack getAttack(String opponent) {
        if (opponent.equals("T")) {
            return Attack.ROAR;
        }
        return Attack.POUNCE;
    }

    public boolean eat() {
        return true;
    }

    public Color getColor() {
        return Color.ORANGE;
    }
}
