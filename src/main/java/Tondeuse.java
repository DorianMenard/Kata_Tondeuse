package main.java;

public class Tondeuse {
    private TondeusePosition tondeusePosition;
    private Surface surface;

    public Tondeuse(TondeusePosition tondeusePosition, Surface surface) {
        this.tondeusePosition = tondeusePosition;
        this.surface = surface;
    }

    public void instructions(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'G':
                    tondeusePosition.gauche();
                    break;
                case 'D':
                    tondeusePosition.droite();
                    break;
                case 'A':
                    TondeusePosition newTondeusePosition = new TondeusePosition(tondeusePosition.getX(), tondeusePosition.getY(), tondeusePosition.getDirection());
                    newTondeusePosition.avancer();
                    if (surface.inSurface(newTondeusePosition)) {
                        tondeusePosition = newTondeusePosition;
                    }
                    break;
            }
        }
    }

    public TondeusePosition getPosition() {
        return tondeusePosition;
    }
}
