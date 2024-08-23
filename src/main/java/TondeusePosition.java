package main.java;

public class TondeusePosition {

    private int x;
    private int y;
    private Direction direction;

    public TondeusePosition(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void avancer() {
        switch (direction) {
            case N:
                y++;
                break;
            case E:
                x++;
                break;
            case S:
                y--;
                break;
            case W:
                x--;
                break;
        }
    }

    public void gauche() {
        direction = direction.gauche();
    }

    public void droite() {
        direction = direction.droite();
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
