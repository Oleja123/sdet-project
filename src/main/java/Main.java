import lection1.abstracts.AbstractHelicopter;
import lection1.helicopters.AttackHelicopter;
import lection1.helicopters.CargoHelicopter;
import lection1.helicopters.MinigunHelicopter;
import lection1.helicopters.RocketLauncherHelicopter;
import lection1.helicopters.supportive.*;
import lection1.interfaces.functional.CheckMod;
import lection1.interfaces.functional.Discriminant;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //Attack helicopter test
        System.out.println();
        System.out.println("Attack helicopter test");
        AttackHelicopter attackHelicopter = new AttackHelicopter("green", 3);
        attackHelicopter.setThePilot(new TestPilot());
        attackHelicopter.getThePilot().SayHello();
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

        //Minigun helicopter test
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

        //Rocket Launcher helicopter test
        System.out.println();
        System.out.println("Rocket Launcher helicopter test");
        RocketLauncherHelicopter<Rocket> rocketLauncherHelicopter = new RocketLauncherHelicopter<>("blue", 3);
        rocketLauncherHelicopter.setThePilot(new TestPilot());
        rocketLauncherHelicopter.getThePilot().SayHello();
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        rocketLauncherHelicopter.setBulletsCount(1);
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.toShootWithAMachineGun());
        System.out.println(rocketLauncherHelicopter.getBladesCount());

        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        rocketLauncherHelicopter.addRocket(new AirToGroundRocket());
        rocketLauncherHelicopter.addRocket(new GroundToAirRocket());
        rocketLauncherHelicopter.addRocket(new AirToGroundRocket());
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        System.out.println(rocketLauncherHelicopter.toLaunchRocket());
        rocketLauncherHelicopter.addRocket(new GroundToAirRocket());
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

        //Cargo helicopter test
        System.out.println();
        System.out.println("Cargo helicopter test");
        CargoHelicopter<Pilot> cargoHelicopter = new CargoHelicopter<>("green", 100);
        cargoHelicopter.setThePilot(new Pilot());
        cargoHelicopter.getThePilot().SayHello();
        cargoHelicopter.setThePilot(new TestPilot());
        cargoHelicopter.getThePilot().SayHello();
        CargoHelicopter<TestPilot> testCargoHelicopter = new CargoHelicopter<>("green", 100);
        testCargoHelicopter.setThePilot(new TestPilot());
        testCargoHelicopter.getThePilot().SayHello();
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

        //Helicopters count test
        System.out.println();
        System.out.println("Helicopters test");
        System.out.println(AbstractHelicopter.createdCoptersCount);

        //functional interfaces
        CheckMod<Integer> isMultipleOf131 = x -> x % 13 == 0;
        System.out.println(isMultipleOf131.checkMod(4));
        System.out.println(isMultipleOf131.checkMod(26));
        System.out.println(isMultipleOf131.checkMod(-39));
        CheckMod<Double> isMultipleOf132 = x -> x % 13 == 0;
        System.out.println(isMultipleOf132.checkMod(4.2));
        System.out.println(isMultipleOf132.checkMod(13.0));

        Discriminant<Double> findD = (a, b, c) -> b * b - 4 * a * c;
        System.out.println(findD.discriminant(3.0, -4.0, -20.0));
        System.out.println(findD.discriminant(7.7, 4.0, 121.2));
    }
}
