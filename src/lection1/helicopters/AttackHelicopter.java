package lection1.helicopters;

import lection1.abstracts.AbstractHelicopter;
import lection1.interfaces.IAttacker;

public class AttackHelicopter extends AbstractHelicopter implements IAttacker {
    protected int bulletsCount;
    public AttackHelicopter(String color, int bulletsCount){
        AbstractHelicopter.createCopter();
        this.color = color;
        this.bulletsCount = bulletsCount;
    }

    public boolean toShootWithAMachineGun() {
        if(bulletsCount == 0) {
            return false;
        }
        System.out.println("bang");
        bulletsCount -= 1;
        return true;
    }

    public int getBulletsCount() {
        return bulletsCount;
    }

    public void setBulletsCount(int bulletsCount){
        this.bulletsCount = bulletsCount;
    }
}
