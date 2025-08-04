import java.awt.Color;

public class Leopard extends Critter {
    private int moveCount;

    public Leopard() {
        super("L");
        moveCount = 0;
    }

    @Override
    public Direction getMove() {
        moveCount++;
        if (moveCount % 2 == 0) {
            return Direction.EAST;
        } else {
            return Direction.NORTH;
        }
    }

    @Override
    public boolean eat() {
        return Math.random() < 0.5;
    }

    @Override
    public Attack getAttack(String opponent) {
        if (opponent.equals("T")) {
            return Attack.SCRATCH;
        }
        return Attack.ROAR;
    }

    @Override
    public Color getColor() {
        return new Color(210, 180, 140);
    }
}
