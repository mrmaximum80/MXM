package lesson11.exception;

/**
 * Исключение для случая превышения массы или габаритов
 */
public class WeightDimensionsException extends RuntimeException {

    public WeightDimensionsException(String message) {
        super(message);
    }
}
