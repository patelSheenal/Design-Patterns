package observerPattern.Burger

import java.util.*

class Burger(val name: String)

class BobCook : Observable() {
    val name = "Bob"

    fun cookBurger(name: String) {
        var burger = Burger(name)
        setChanged()
        notifyObservers(burger)
    }
}

class TinaWaiter : Observer {
    val name = "Tina"
    override fun update(cook: Observable?, meal: Any?) {
        when (cook) {
            is BobCook -> {
                if (meal is Burger) {
                    println("$name is serving a ${meal.name} cooked by ${cook.name}")
                }
            }
            else -> println("Please wait for your meal")
        }
    }
}