import java.awt.Color;

public class Ocelot extends Critter {
    private Direction[] path = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
    private int index = 0;

    public Ocelot() {
        super("O");
    }

    @Override
    public Direction getMove() {
        Direction move = path[index];
        index = (index + 1) % path.length;
        return move;
    }

    @Override
    public boolean eat() {
        return Math.random() < 0.33;
    }

    @Override
    public Attack getAttack(String opponent) {
        if (opponent.equals("F")) {
            return Attack.SCRATCH;
        } else if (opponent.equals("L") || opponent.equals("D")) {
            return Attack.ROAR;
        }
        return Attack.POUNCE;
    }

    @Override
    public Color getColor() {
        return new Color(140, 120, 90);
    }
}
