package com.main;

import java.util.EnumMap;
import java.util.Map;

/**
 * A more efficient implementation of the Factory Method pattern
 * using an EnumMap to cache and reuse weapon instances.
 */
public interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);
}

class ElfBlacksmith implements Blacksmith {
    private final Map<WeaponType, Weapon> weaponCache = new EnumMap<>(WeaponType.class);

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return weaponCache.computeIfAbsent(weaponType, ElfWeapon::new);
    }
}

class OrcBlacksmith implements Blacksmith {
    private final Map<WeaponType, Weapon> weaponCache = new EnumMap<>(WeaponType.class);

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return weaponCache.computeIfAbsent(weaponType, OrcWeapon::new);
    }
}

// Assuming these classes are defined elsewhere in your project
enum WeaponType {
    SWORD, AXE, BOW
}

class Weapon {
    // Weapon properties and methods
}

class ElfWeapon extends Weapon {
    ElfWeapon(WeaponType weaponType) {
        // Constructor implementation
    }
}

class OrcWeapon extends Weapon {
    OrcWeapon(WeaponType weaponType) {
        // Constructor implementation
    }
}