
public class Feline extends Critter {
    private int moveCount; // counter for getMove method before random direction
    private int eatCount; // counter for eating
    private Direction currDir; // current direction

    public Feline() {
        // TODO
        super("Fe");
        this.moveCount = 5; // immediately choose direction
        this.eatCount = 0;
        this.currDir = Direction.NORTH;
    }

    @Override
    public Direction getMove() {
        // TODO
        if (moveCount == 5) {
           
            Direction[] directions = {Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST};
            currDir = directions[random.nextInt(directions.length)];
            moveCount = 0; // reset counter
        }
        moveCount++;
        return currDir;
    }    

    @Override
    public boolean eat() {
        // TODO
        eatCount++;
        if (eatCount == 3) {
            eatCount = 0; // reset counter after eating
            return true;
        }
        return false;
    }

    @Override
    public Attack getAttack(String opponent){
       // TODO
       return Attack.POUNCE;
    }
}
