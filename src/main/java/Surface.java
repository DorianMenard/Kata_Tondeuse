package main.java;

public class Surface {
    private int maxX;
    private int maxY;

    public Surface(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean inSurface(TondeusePosition tondeusePosition) {
        return tondeusePosition.getX() >= 0 && tondeusePosition.getX() <= maxX &&
                tondeusePosition.getY() >= 0 && tondeusePosition.getY() <= maxY;
    }
}
