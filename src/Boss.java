class Boss extends  GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public void printInfo(){
        System.out.println("Boss Nema:" + name);
        System.out.println("Boss Health:" + health);
        if (weapon != null){
            System.out.println("Boss Weapon:" + weapon.getName() + "(" + weapon.getType() + ")");
        }
    }
}

