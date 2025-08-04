import java.awt.Color;

public class Starfish extends Critter {
    private static final String SPECIES_NAME = "Patrick";

    /**
    \
     */
    public Starfish() {
        super(SPECIES_NAME);
    }

    @Override
    public Direction getMove() {
        return Direction.CENTER;
        // TODO
    }

    /**
     * Returns the color of the Starfish
     * 
     * @return Color pink
     */
    @Override 
    public Color getColor() {
        return Color.PINK;
    }
}
