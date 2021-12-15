package lesson11;

import lesson11.enumer.CarMarks;
import lesson11.enumer.StateNumberSymbols;
import lesson11.enumer.TruckMarks;

public class Truck extends Automobile {

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
        setSpeed(40 + Math.round(Math.random() * 800) / 10d);
    }

    @Override
    public void weightGen() {
        setWeight(4 + Math.round(Math.random() * 100) / 10d);
    }

    @Override
    public void widthGen() {
        setWidth(1 + Math.round(Math.random() * 20) / 10d);
    }

    @Override
    public void heightGen() {
        setHeight(2 + Math.round(Math.random() * 50) / 10d);
    }

    @Override
    public void lengthGen() {
        setLength(5 + Math.round(Math.random() * 100) / 10d);
    }

    @Override
    public void stateNumberGen() {
        setStateNumber(StateNumberSymbols.getSymbol() + String.valueOf((int) (Math.random() * 10) +
                String.valueOf((int) (Math.random() * 10) + String.valueOf((int) (Math.random() * 10)) +
                        StateNumberSymbols.getSymbol() + StateNumberSymbols.getSymbol())));
    }

    @Override
    public void markGen() {
        setMark(TruckMarks.getMark());
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
