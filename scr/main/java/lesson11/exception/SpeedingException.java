package lesson11.exception;

/**
 * Исключение для превышения скорости более 80, но менее 100 км/ч
 */
public class SpeedingException extends RuntimeException {

    public SpeedingException(String message) {
        super(message);
    }
}
