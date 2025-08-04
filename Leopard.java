import java.awt.Color;

public class Leopard extends Critter {
    public Leopard() {
        super("Leo");
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }

    @Override
    public Critter.Attack getAttack(String opponent) {
        if (opponent.equals("T")) {
            return Critter.Attack.ROAR;
        }
        return Critter.Attack.POUNCE;
    }

    @Override
    public Direction getMove() {
        return Direction.values()[random.nextInt(4)];
    }

    @Override
    public boolean eat() {
        return random.nextBoolean();
    }
}
