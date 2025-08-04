
import java.awt.Color;

public class Lion extends Feline {
    private int winCount;        // Number of fights won since last meal/sleep
    private int moveStep;        // Counter to track move direction (0 to 19)

    public Lion() {
        super();                 // Calls Feline constructor, sets name to "Fe"
        this.displayName = "Lion";
        this.winCount = 0;
        this.moveStep = 0;
    }

    @Override
    public Direction getMove() {
        // 5 moves in each direction: E → S → W → N → repeat
        Direction[] path = {
            Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.NORTH
        };
        Direction dir = path[(moveStep / 5) % 4];
        moveStep++;
        return dir;
    }

    @Override
    public boolean eat() {
        if (winCount > 0) {
            winCount = 0; // eating resets hunger
            return true;
        }
        return false;
    }

    @Override
    public void win() {
        winCount++;
    }

    @Override
    public void sleep() {
        winCount = 0;
        this.displayName = "noiL";
    }

    @Override
    public void wakeup() {
        this.displayName = "Lion";
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }
}
