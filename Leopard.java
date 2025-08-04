import java.awt.Color;

public class Leopard extends Feline {
    protected static int confidence = 0;

    public Leopard() {
        super();
        this.displayName = "Lpd";
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public Direction getMove() {
        String north = info.getNeighbor(Direction.NORTH);
        String south = info.getNeighbor(Direction.SOUTH);
        String east = info.getNeighbor(Direction.EAST);
        String west = info.getNeighbor(Direction.WEST);

        if (north.equals(".") || north.equals("Patrick")) {
            return Direction.NORTH;
        } else if (south.equals(".") || south.equals("Patrick")) {
            return Direction.SOUTH;
        } else if (east.equals(".") || east.equals("Patrick")) {
            return Direction.EAST;
        } else if (west.equals(".") || west.equals("Patrick")) {
            return Direction.WEST;
        } else {
            // 
            Direction[] dirs = {Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST};
            return dirs[random.nextInt(dirs.length)];
        }
    }

    @Override
    public boolean eat() {
        int chance = confidence * 10;
        return random.nextInt(100) < chance;
    }

    @Override
    public void win() {
        if (confidence < 10) {
            confidence++;
        }
    }

    @Override
    public void lose() {
        if (confidence > 0) {
            confidence--;
        }
    }

    @Override
    public Attack getAttack(String opponent) {
        if (opponent.equals("Turtle") || confidence > 5) {
            return Attack.POUNCE;
        } else {
            return generateAttack(opponent);
        }
    }

    // required protected helper
    protected Attack generateAttack(String opponent) {
        if (opponent.equals("Patrick")) {
            return Attack.FORFEIT;
        }

        Attack[] attacks = {Attack.ROAR, Attack.POUNCE, Attack.SCRATCH};
        return attacks[random.nextInt(attacks.length)];
    }

    @Override
    public void reset() {
        confidence = 0;
    }
}
