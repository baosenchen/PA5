import java.awt.Color;

public class Ocelot extends Critter {
    private Direction[] moves = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
    private int index = 0;

    public Ocelot() {
        super("O");
    }

    @Override
    public Direction getMove() {

        Direction move = moves[index];
        index = (index + 1) % moves.length;
        return move;
    }

    @Override
    public boolean eat() {
        return Math.random() < 0.33;
    }

    @Override
    public Attack getAttack(String opponent) {
        if (opponent.equals("D") || opponent.equals("L")) {
            return Attack.ROAR;
        }
        return Attack.SCRATCH;
    }

    @Override
    public Color getColor() {
        return new Color(140, 120, 90); 
    }
}
