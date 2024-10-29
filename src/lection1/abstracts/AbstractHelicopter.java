package lection1.abstracts;

import lection1.helicopters.supportive.Pilot;
import lection1.interfaces.IFlying;
import lection1.interfaces.IPilotable;

import java.util.Random;

public abstract class AbstractHelicopter<T extends Pilot> implements IFlying, IPilotable<T> {
    public static int createdCoptersCount = 0;
    protected int bladesCount = 4;
    protected T pilot;

    protected String color = "White";

    protected boolean isBroken = false;

    private final Random random = new Random();
    public boolean inFlight = false;

    public boolean toTakeOff() {
        if (isBroken) return false;
        inFlight = true;
        System.out.println("whr-whr-wwhr-wwhr-wwww");
        return true;
    }

    public T getThePilot() {
        return pilot;
    }

    public void setThePilot(T pilot) {
        this.pilot = pilot;
    }

    public boolean toLand() {
        if (!inFlight) return false;
        inFlight = false;
        int rand_int = random.nextInt(1000);
        if (rand_int % 4 == 0) isBroken = true;
        System.out.println("wwww-wwhr-wwhr-whr-whr");
        return true;
    }

    public static void createCopter() {
        createdCoptersCount += 1;
    }

    public int getBladesCount() {
        return bladesCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsBroken() {
        return isBroken;
    }

    public void repair() {
        isBroken = false;
    }

}
