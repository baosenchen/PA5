import java.awt.Color;

public class Ocelot extends Leopard {

    public Ocelot() {
        super();
        this.displayName = "Oce";
    }

    @Override
    public Color getColor() {
        return Color.LIGHT_GRAY;
    }

    @Override
    protected Attack generateAttack(String opponent) {
        if (opponent.equals("L") || opponent.equals("F") || opponent.equals("Lpd")) {
            return Attack.SCRATCH;
        } else {
            return Attack.POUNCE;
        }
    }
}


