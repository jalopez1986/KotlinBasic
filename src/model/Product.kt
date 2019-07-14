package model

open class Product(var name: String, var description: String, var sku: Int) {
    override fun toString(): String {
        return "Name: $name \nDescription: $description \nSKU: $sku"
    }

    open fun create(): String {
        return "Create"
    }

    open fun read(): String {
        return "Read"
    }

    open fun update(): String {
        return "Update"
    }

    open fun delete(): String {
        return "Delete"
    }
}