package decoratorPattern

interface Salad{
    fun addIngredient(): String
}


class SaladMake : Salad{
    override fun addIngredient(): String {
        return "Onion, Tomatoes"
    }
}

open class SaladDecorator(var salad: Salad): Salad {
    override fun addIngredient(): String {
        return salad.addIngredient()
    }
}

class CucumberSalad(salad: Salad): SaladDecorator(salad){
    override fun addIngredient(): String {
        return salad.addIngredient() + ", Cucumber"
    }
}

class CarrotSalad(salad: Salad): SaladDecorator(salad){
    override fun addIngredient(): String {
        return salad.addIngredient() + ", Carrot"
    }
}