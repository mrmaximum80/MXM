package lesson11;

import lesson11.enumer.CarMarks;
import lesson11.exception.EmergencySpeedingException;
import lesson11.exception.SpeedingException;
import lesson11.exception.WeightDimensionsException;

public abstract class Automobile {

    private String mark;
    private String stateNumber;
    private double speed;
    private double weight;
    private double width;
    private double height;
    private double length;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void speedCheck() {
        if (this.speed > 80 && speed < 100) {
            throw new SpeedingException("Автомобиль " + this.mark + " движется со скоростью более 80 км/ч (" +
                    this.speed + " км/ч)! Проед через КПП запрещается!");
        }
        if (this.speed > 100) {
            throw new EmergencySpeedingException("Автомобиль " + this.mark + ", госномер" + this.stateNumber +
                    " движется со скоростью более 100 км/ч (" + this.speed + " км/ч)! Для предотвращения нарушения вызвана полиция!");
        }
        System.out.println("Автомобиль " + this.mark + ", госномер " + this.stateNumber + " движется с разрешенной скоростью" +
                " для проезда через КПП.");
    }

    public void weightDimensionsCheck() {
        if (this.weight > 8 || this.height > 4 || this.width > 2.5) {
            throw new WeightDimensionsException("Автомобиль " + this.mark + ", госномер" + this.stateNumber +
                    " не допускается к проезду через КПП, так как его вес / габариты превышают допустимые.");
        }
        System.out.println("Автомобиль " + this.mark + ", госномер " + this.stateNumber +
                " допускается к проезду через КПП, так как его вес / габариты не превышают допустимые.");
    }

    public void speedGen() {
    }

    public void weightGen() {
    }

    public void widthGen() {
    }

    public void heightGen() {
    }

    public void lengthGen() {
    }

    public void stateNumberGen() {
    }

    public void markGen() {
    }
}
