import java.util.Random;

public class Ocelot extends Critter {
    private Random rand = new Random();

    public Ocelot() {
        super("Ocelot");
    }

    public Direction getMove() {
        int n = rand.nextInt(8);
        switch (n) {
            case 0: return Direction.NORTH;
            case 1: return Direction.SOUTH;
            case 2: return Direction.EAST;
            case 3: return Direction.WEST;
            case 4: return Direction.NORTHEAST;
            case 5: return Direction.NORTHWEST;
            case 6: return Direction.SOUTHEAST;
            default: return Direction.SOUTHWEST;
        }
    }

    public Attack getAttack(String opponent) {
        if (opponent.equals("F")) {
            return Attack.SCRATCH;
        }
        return Attack.POUNCE;
    }

    public boolean eat() {
        return rand.nextBoolean();
    }

    public Color getColor() {
        return Color.MAGENTA;
    }
}

