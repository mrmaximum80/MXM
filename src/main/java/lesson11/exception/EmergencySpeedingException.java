package lesson11.exception;

/**
 * Исключение для случая привышения скорости более 100 км/ч
 */
public class EmergencySpeedingException extends RuntimeException {

    public EmergencySpeedingException(String message) {
        super(message);
    }
}
