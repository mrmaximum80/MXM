package lesson11;

import lesson11.enumer.CarMarks;
import lesson11.enumer.StateNumberSymbols;

public class Car extends Automobile {

    @Override
    public void speedCheck() {
        super.speedCheck();
    }

    @Override
    public void weightDimensionsCheck() {
        super.weightDimensionsCheck();
    }

    @Override
    public void speedGen() {
        setSpeed(60 + Math.round(Math.random() * 900) / 10d);
    }

    @Override
    public void weightGen() {
        setWeight(1 + Math.round(Math.random() * 20) / 10d);
    }

    @Override
    public void widthGen() {
        setWidth(1 + Math.round(Math.random() * 10) / 10d);
    }

    @Override
    public void heightGen() {
        setHeight(1 + Math.round(Math.random() * 10) / 10d);
    }

    @Override
    public void lengthGen() {
        setLength(3 + Math.round(Math.random() * 30) / 10d);
    }

    @Override
    public void stateNumberGen() {
        setStateNumber(StateNumberSymbols.getSymbol() + String.valueOf((int) (Math.random() * 10) +
                String.valueOf((int) (Math.random() * 10) + String.valueOf((int) (Math.random() * 10)) +
                        StateNumberSymbols.getSymbol() + StateNumberSymbols.getSymbol())));
    }

    @Override
    public void markGen() {
        setMark(CarMarks.getMark());
    }

    public String toString() {
        return ("Автомобиль " + getMark() +
                ", госномер = " + getStateNumber() +
                ", скорость = " + getSpeed() +
                ", ширина = " + getWidth() +
                ", высота = " + getHeight() +
                ", длина = " + getLength() +
                ", вес = " + getWeight());
    }
}
