package com.main;

// Define the WeaponType enum
enum WeaponType {
    SWORD, AXE, BOW
}

// Define the Weapon interface or base class
abstract class Weapon {
    protected WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public abstract void use();
}

// Define ElfWeapon and OrcWeapon classes
class ElfWeapon extends Weapon {
    public ElfWeapon(WeaponType weaponType) {
        super(weaponType);
    }

    @Override
    public void use() {
        System.out.println("Using Elf " + weaponType);
    }
}

class OrcWeapon extends Weapon {
    public OrcWeapon(WeaponType weaponType) {
        super(weaponType);
    }

    @Override
    public void use() {
        System.out.println("Using Orc " + weaponType);
    }
}

// Define the Blacksmith interface
interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);
}

// Implement the Blacksmith interface for Elf and Orc blacksmiths
class ElfBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}

class OrcBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Blacksmith elfBlacksmith = new ElfBlacksmith();
        Weapon elfWeapon = elfBlacksmith.manufactureWeapon(WeaponType.SWORD);
        elfWeapon.use(); // Output: Using Elf SWORD

        Blacksmith orcBlacksmith = new OrcBlacksmith();
        Weapon orcWeapon = orcBlacksmith.manufactureWeapon(WeaponType.AXE);
        orcWeapon.use(); // Output: Using Orc AXE
    }
}