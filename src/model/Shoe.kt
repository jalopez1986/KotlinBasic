package model

class Shoe {
    var size: Int = 34 //Minimo sea 34
        set(value) {
            if (value >= 34)
                field = value
            else
                field = 34
        }
    get() = field //redundante porque es el mismo valor

    var color: String = "White" //no hay restricciones
    var model: String = "Boots"  //no se permite el valor tennis
        set(value) {
            if (value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }
        get() = "El zapato es $field"
}