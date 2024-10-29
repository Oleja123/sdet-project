package lection1.helicopters;

import lection1.helicopters.supportive.Rocket;
import lection1.interfaces.IRocketLaunchable;

import java.util.ArrayDeque;

public class RocketLauncherHelicopter<T extends Rocket> extends AttackHelicopter implements IRocketLaunchable {
    private final ArrayDeque<T> rocketLine;
    public RocketLauncherHelicopter(String color, int bulletsCount){
        super(color, bulletsCount);
        rocketLine = new ArrayDeque<>();
    }

    public boolean toLaunchRocket() {
        if(rocketLine.isEmpty()) {
            return false;
        }
        System.out.println("sch-sch-sch-pow");
        rocketLine.getFirst().SayHello();
        rocketLine.removeFirst();
        return true;
    }

    public void addRocket(T rocket){
        rocketLine.add(rocket);
    }
}
