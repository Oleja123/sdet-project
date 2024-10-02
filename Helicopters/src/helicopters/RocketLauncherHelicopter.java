package helicopters;

import interfaces.IRocketLaunchable;

public class RocketLauncherHelicopter extends AttackHelicopter implements IRocketLaunchable {
    private int rocketsCount;
    public RocketLauncherHelicopter(String color, int bulletsCount, int rocketsCount){
        super(color, bulletsCount);
        this.rocketsCount = rocketsCount;
    }

    public boolean toLaunchRocket() {
        if(rocketsCount == 0) {
            return false;
        }
        System.out.println("sch-sch-sch-pow");
        rocketsCount -= 1;
        return true;
    }

    public int getRocketsCount() {
        return rocketsCount;
    }

    public void setRocketsCount(int rocketsCount){
        this.rocketsCount = rocketsCount;
    }
}
