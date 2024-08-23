package main.java;

public enum Direction {
    N, E, S, W;

    public Direction gauche() {
        switch (this) {
            case N: return W;
            case E: return N;
            case S: return E;
            case W: return S;
        }
        return this;
    }

    public Direction droite() {
        switch (this) {
            case N: return E;
            case E: return S;
            case S: return W;
            case W: return N;
        }
        return this;
    }
}
