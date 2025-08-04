import java.awt.Color;

public class Turtle extends Critter {

    public Turtle() {
        super("Tu");
    }

    @Override
    public Direction getMove() {
        return Direction.WEST;
    }

    @Override
    public boolean eat() {
        // Get neighbors in 4 directions
        String north = info.getNeighbor(Direction.NORTH);
        String south = info.getNeighbor(Direction.SOUTH);
        String east = info.getNeighbor(Direction.EAST);
        String west = info.getNeighbor(Direction.WEST);

        // " " or "."  threat
        return isSafe(north) && isSafe(south) && isSafe(east) && isSafe(west);
    }

    // check if a neighbor is nohostile
    private boolean isSafe(String neighbor) {
        return neighbor.equals(" ") || neighbor.equals(".") || neighbor.equals("Tu");
    }

    @Override
    public Attack getAttack(String opponent) {
        // 50% ROAR, 50% FORFEIT
        return random.nextBoolean() ? Attack.ROAR : Attack.FORFEIT;
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
