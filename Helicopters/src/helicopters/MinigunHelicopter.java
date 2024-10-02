package helicopters;

public class MinigunHelicopter extends AttackHelicopter{
    public MinigunHelicopter(String color, int bulletsCount){
        super(color, bulletsCount);
    }

    @Override
    public boolean toShootWithAMachineGun() {
        if(bulletsCount == 0) {
            return false;
        }
        System.out.println("wzh-wzh-bang");
        bulletsCount -= 1;
        return true;
    }
}
