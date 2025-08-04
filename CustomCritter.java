
import java.awt.Color;

public class CustomCritter extends Critter {
    private int eatCounter; 

    public CustomCritter() {
        super("Dragon");
        this.eatCounter = 0;
    }

    @Override
    public Direction getMove() {
        
        String north = info.getNeighbor(Direction.NORTH);
        String south = info.getNeighbor(Direction.SOUTH);
        String east = info.getNeighbor(Direction.EAST);
        String west = info.getNeighbor(Direction.WEST);

        if (isEnemy(north)) return Direction.NORTH;
        if (isEnemy(south)) return Direction.SOUTH;
        if (isEnemy(east))  return Direction.EAST;
        if (isEnemy(west))  return Direction.WEST;

        
        Direction[] dirs = {Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST};
        return dirs[random.nextInt(dirs.length)];
    }

    
    private boolean isEnemy(String s) {
        return !s.equals(" ") && !s.equals(".") && !s.equals("Dragon");
    }

    @Override
    public boolean eat() {
        eatCounter++;
        if (eatCounter >= 5) {
            eatCounter = 0;
            return true; 
        }
        return false;
    }

    @Override
    public Attack getAttack(String opponent) {
        if (opponent.equals("Patrick")) {
            return Attack.FORFEIT;
        }
        return Attack.ROAR;
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
