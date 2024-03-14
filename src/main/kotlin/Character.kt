sealed class Character(val name: String, val weaponType: WeaponType) {

    companion object {

        const val WARRIOR_NAME = "Воин"
        const val MAGE_NAME = "Маг"
        const val ARCHER_NAME = "Лучник"
    }

    class Warrior(name: String, weaponType: WeaponType, val ability: String) : Character(name, weaponType)

    class Mage (name: String, weaponType: WeaponType, val spell: String) : Character(name, weaponType)

    class Archer (name: String, weaponType: WeaponType, val ability: String) : Character(name, weaponType)
}