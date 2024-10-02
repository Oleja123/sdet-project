import abstracts.AbstractHelicopter;
import helicopters.AttackHelicopter;
import helicopters.CargoHelicopter;
import helicopters.MinigunHelicopter;
import helicopters.RocketLauncherHelicopter;
import helicopters.supportive.Cargo;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ///Attack helicopter test
        System.out.println();
        System.out.println("Attack helicopter test");
        AttackHelicopter attackHelicopter = new AttackHelicopter("green", 3);
        System.out.println(attackHelicopter.toShootWithAMachineGun());
        System.out.println(attackHelicopter.toShootWithAMachineGun());
        System.out.println(attackHelicopter.toShootWithAMachineGun());
        System.out.println(attackHelicopter.toShootWithAMachineGun());
        attackHelicopter.setBulletsCount(1);
        System.out.println(attackHelicopter.toShootWithAMachineGun());
        System.out.println(attackHelicopter.toShootWithAMachineGun());
        System.out.println(attackHelicopter.getBladesCount());
        for(int i = 0; i < 5; i++) {
            attackHelicopter.toTakeOff();
            attackHelicopter.toLand();
            System.out.println(attackHelicopter.getIsBroken());
        }
        attackHelicopter.repair();
        attackHelicopter.toTakeOff();
        attackHelicopter.toLand();
        System.out.println(attackHelicopter.getColor());
        attackHelicopter.setColor("black");
        System.out.println(attackHelicopter.getColor());

        ///Minigun helicopter test
        System.out.println();
        System.out.println("Minigun helicopter test");
        MinigunHelicopter minigunHelicopter = new MinigunHelicopter("black", 3);
        System.out.println(minigunHelicopter.toShootWithAMachineGun());
        System.out.println(minigunHelicopter.toShootWithAMachineGun());
        System.out.println(minigunHelicopter.toShootWithAMachineGun());
        System.out.println(minigunHelicopter.toShootWithAMachineGun());
        minigunHelicopter.setBulletsCount(1);
        System.out.println(minigunHelicopter.toShootWithAMachineGun());
        System.out.println(minigunHelicopter.toShootWithAMachineGun());
        System.out.println(minigunHelicopter.getBladesCount());
        for(int i = 0; i < 5; i++) {
            minigunHelicopter.toTakeOff();
            minigunHelicopter.toLand();
            System.out.println(minigunHelicopter.getIsBroken());
        }
        minigunHelicopter.repair();
        minigunHelicopter.toTakeOff();
        minigunHelicopter.toLand();
        System.out.println(minigunHelicopter.getColor());
        minigunHelicopter.setColor("red");
        System.out.println(minigunHelicopter.getColor());

        ///Rocket Launcher helicopter test
        System.out.println();
        System.out.println("Rocket Launcher helicopter test");
        RocketLauncherHelicopter rocketLauncherHelicopter = new RocketLauncherHelicopter("blue", 3, 2);
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        rocketLauncherHelicopter.setBulletsCount(1);
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.getBladesCount());

        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        rocketLauncherHelicopter.setRocketsCount(1);
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        for(int i = 0; i < 5; i++) {
            rocketLauncherHelicopter.toTakeOff();
            rocketLauncherHelicopter.toLand();
            System.out.println(rocketLauncherHelicopter.getIsBroken());
        }
        rocketLauncherHelicopter.repair();
        rocketLauncherHelicopter.toTakeOff();
        rocketLauncherHelicopter.toLand();
        System.out.println(rocketLauncherHelicopter.getColor());
        rocketLauncherHelicopter.setColor("brown");
        System.out.println(rocketLauncherHelicopter.getColor());

        ///Cargo helicopter test
        System.out.println();
        System.out.println("Cargo helicopter test");
        CargoHelicopter cargoHelicopter = new CargoHelicopter("green", 100);
        System.out.println(cargoHelicopter.toLoad(new Cargo(15, "cargo1")));
        System.out.println(cargoHelicopter.toLoad(new Cargo(30, "cargo2")));
        System.out.println(cargoHelicopter.toLoad(new Cargo(45, "cargo3")));
        System.out.println(cargoHelicopter.toLoad(new Cargo(20, "cargo4")));
        System.out.println(cargoHelicopter.toUnload());
        System.out.println(cargoHelicopter.toLoad(new Cargo(20, "cargo4")));
        cargoHelicopter.showCargoList();
        System.out.println(cargoHelicopter.getCurrentCapacity());
        System.out.println(cargoHelicopter.toUnload());
        System.out.println(cargoHelicopter.toUnload());
        System.out.println(cargoHelicopter.toUnload());
        System.out.println(cargoHelicopter.toUnload());
        System.out.println(cargoHelicopter.getBladesCount());
        System.out.println(cargoHelicopter.getMaxCapacity());
        System.out.println(cargoHelicopter.getCurrentCapacity());

        ///Helicopters count test
        System.out.println();
        System.out.println("Helicopters test");
        System.out.println(AbstractHelicopter.createdCoptersCount);
    }
}
