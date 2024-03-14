object CharacterCommon {
    fun attack(character: Character) {
        val characterType = when (character){
            is Character.Warrior -> "Воин"
            is Character.Mage -> "Маг"
            is Character.Archer -> "Лучник"
        }
        println("${character.name} атакует с помощью ${character.weaponType.weaponName}. ($characterType)")
    }

    fun defend(character: Character){
        val characterType = when (character){
            is Character.Warrior -> "Воин"
            is Character.Mage -> "Маг"
            is Character.Archer -> "Лучник"
        }
        println("${character.name} защищаеться, используя ${character.weaponType.weaponName}. ($characterType)")
    }
}