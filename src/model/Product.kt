package model

abstract class Product(var name: String, var description: String, var sku: Int) {
    override fun toString(): String {
        return "Name: $name \nDescription: $description \nSKU: $sku"
    }

    abstract fun create(): String

    abstract fun read(): String

    abstract fun update(): String

    open fun delete(): String {  //no obliga a tener que sobreescribir
        return "Delete"
    }
}