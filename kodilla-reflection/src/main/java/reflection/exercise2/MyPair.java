package reflection.exercise2;

public class MyPair<U, T> {

    private U x;
    private T y;

    public MyPair(U x, T y) {
        this.x = x;
        this.y = y;
    }

    public U getX() {
        return x;
    }

    public void setX(U x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
