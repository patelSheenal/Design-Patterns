package observerPattern.Burger

class RestaurantMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bob = BobCook()
            bob.addObserver(TinaWaiter())
            bob.cookBurger("Cheeze burger")
        }
    }
}