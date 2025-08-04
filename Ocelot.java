import java.awt.Color;

public class Ocelot extends Critter {
    public Ocelot() {
        super("Oce");
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    @Override
    public Critter.Attack getAttack(String opponent) {
        if (opponent.equals("L")) {
            return Critter.Attack.FORFEIT;
        }
        return Critter.Attack.SCRATCH;
    }

    @Override
    public Direction getMove() {
        return Direction.values()[random.nextInt(4)];
    }

    @Override
    public boolean eat() {
        return true;
    }
}
