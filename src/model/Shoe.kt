package model

class Shoe(name: String, description: String, sku: Int, var brand: String):Product(name, description, sku) {

    init {
        println("Metodo que se ejecuta al instanciarse un objeto")
    }

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

    override fun toString(): String {
        return super.toString() + "\nSKU ID: $sku \nMarca: $brand \nModelo: $model \nSize: $size \nColor: $color"
    }

    override fun create(): String {
        return "Create Shoe"
    }

    override fun read(): String {
        return "Read Shoe"
    }

    override fun update(): String {
        return "Update Shoe"
    }

    override fun delete(): String {
        return "Delete Shoe"
    }





}