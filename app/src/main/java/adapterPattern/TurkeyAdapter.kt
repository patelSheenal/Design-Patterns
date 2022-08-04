package adapterPattern

class TurkeyAdapter(turkey: Turkey): Duck {
    val currentTurkey = turkey

    override fun fly() {
        currentTurkey.turkeyFly()
    }

    override fun quack() {
        currentTurkey.gobble()
    }
}