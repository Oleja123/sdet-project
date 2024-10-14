import lection1.abstracts.AbstractHelicopter;
import lection1.helicopters.AttackHelicopter;
import lection1.helicopters.CargoHelicopter;
import lection1.helicopters.MinigunHelicopter;
import lection1.helicopters.RocketLauncherHelicopter;
import lection1.helicopters.supportive.Cargo;
import lection2.DataChecker;

import java.util.Scanner;

public class Main {
    private static void checkLection1(){
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
    private static void checkLection2(){
        String login, password, confirmPassword;
        Scanner sc = new Scanner(System.in);
        login = sc.nextLine();
        password = sc.nextLine();
        confirmPassword = sc.nextLine();
        System.out.println(DataChecker.checkData(login, password, confirmPassword));
    }
    public static void main(String[] args) {
        checkLection2();
    }
}
