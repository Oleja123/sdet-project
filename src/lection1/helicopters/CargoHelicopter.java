package lection1.helicopters;

import lection1.abstracts.AbstractHelicopter;
import lection1.helicopters.supportive.Cargo;
import lection1.helicopters.supportive.Pilot;
import lection1.interfaces.ICargo;

import java.util.Stack;

public class CargoHelicopter<T extends Pilot> extends AbstractHelicopter<T> implements ICargo {
    Stack<Cargo> cargoLine;

    private final int maxCapacity;

    private int currentCapacity;

    public CargoHelicopter(String color, int capacity) {
        AbstractHelicopter.createCopter();
        this.color = color;
        this.bladesCount = 8;
        maxCapacity = capacity;
        currentCapacity = 0;
        cargoLine = new Stack<>();
    }

    public boolean toLoad(Cargo cargo) {
        if(currentCapacity + cargo.getWeight() > maxCapacity)
            return false;
        cargoLine.push(cargo);
        currentCapacity += cargo.getWeight();
        return true;
    }

    public Cargo toUnload() {
        if(cargoLine.empty())
            return null;
        var toRet = cargoLine.pop();
        currentCapacity -= toRet.getWeight();
        return toRet;
    }

    public void showCargoList(){
        for(Cargo cargo : cargoLine)
            System.out.println(cargo.getName());
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    public int getCurrentCapacity(){
        return currentCapacity;
    }
}
