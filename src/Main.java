public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Evil Boss");
        boss.setHealth(100);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Dark Blade");
        boss.setWeapon(bossWeapon);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Skeleton Warrior");
        skeleton1.setHealth(50);
        skeleton1.setArrowCount(10);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Archer Sceleton");
        skeleton2.setHealth(30);
        skeleton2.setArrowCount(20);

        System.out.println("Skeleton 1 Info:");
        skeleton1.printInfo();
        System.out.println("\nSkeleton 2 Info:");
        skeleton2.printInfo();
    }
}