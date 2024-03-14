fun main() {
    val scanner = MyScanner(System.`in`)

    println("Введите 0 для защиты или 1 для атаки:")
    val choice = scanner.nextInt()

    when (choice){
        0 -> {
            val warrior = Character.Warrior(Character.WARRIOR_NAME, WeaponType.SWORD, "Защищать")
            val mage = Character.Mage(Character.MAGE_NAME, WeaponType.STICK, "Колдовать")
            val archer = Character.Archer(Character.ARCHER_NAME, WeaponType.BOW, "Стрелять")

            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }

        1 -> {
            val warrior = Character.Warrior(Character.WARRIOR_NAME, WeaponType.SWORD, "Защищать")
            val mage = Character.Mage(Character.MAGE_NAME, WeaponType.STICK, "Колдовать")
            val archer = Character.Archer(Character.ARCHER_NAME, WeaponType.BOW, "Стрелять")

            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)

            val hiller = object{
                val name = "Лекарь"
                fun hill() {
                    val message: MyString = "$name Вылечил всех персонажей."
                    println(message)
                }
            }
            hiller.hill()
        }
        else -> println("Неверный выбор")

    }
}