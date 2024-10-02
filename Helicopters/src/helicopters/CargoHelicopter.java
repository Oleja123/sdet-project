package helicopters;

import abstracts.AbstractHelicopter;
import helicopters.supportive.Cargo;
import interfaces.ICargo;

import java.util.Queue;
import java.util.Stack;

public class CargoHelicopter extends AbstractHelicopter implements ICargo {
    Stack<Cargo> cargoLine;

    private int maxCapacity;

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
