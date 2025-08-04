
import java.awt.Color;

public class Elephant extends Critter {
    protected static int goalX = 0;
    protected static int goalY = 0;

    public Elephant() {
        super("El");
    }

    @Override
    public Direction getMove() {
        int x = info.getX();
        int y = info.getY();

        // 如果已到目标，选新目标
        if (x == goalX && y == goalY) {
            goalX = random.nextInt(info.getWidth());
            goalY = random.nextInt(info.getHeight());
        }

        int dx = Math.abs(goalX - x);
        int dy = Math.abs(goalY - y);

        if (dx >= dy) {
            return (goalX > x) ? Direction.EAST : Direction.WEST;
        } else {
            return (goalY > y) ? Direction.SOUTH : Direction.NORTH;
        }
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    public void mate() {
        incrementLevel(2);
    }

    @Override
    public void reset() {
        goalX = 0;
        goalY = 0;
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }
}
