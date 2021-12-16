package lesson12.exception;

public class MyArrayDataException extends RuntimeException {

    int i;
    int j;

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
