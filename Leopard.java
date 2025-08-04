import java.awt.Color;

public class Leopard extends Critter {
    private int stepCount;

    public Leopard() {
        super("L");
        stepCount = 0;
    }

    @Override
    public Direction getMove() {
        stepCount++;
        if (stepCount % 3 == 0) {
            return Direction.values()[(int)(Math.random() * 4)];
        }
        return Direction.NORTH;
    }

    @Override
    public boolean eat() {
        
        return Math.random() < 0.5;
    }

    @Override
    public Attack getAttack(String opponent) {
        
        if (opponent.equals("%") || opponent.equals("S") || opponent.equals("T")) {
            return Attack.ROAR;
        }
        return Attack.SCRATCH;
    }

    @Override
    public Color getColor() {
        return new Color(210, 180, 140); 
    }
}
