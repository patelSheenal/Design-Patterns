package adapterPattern

interface Duck {
    fun fly()
    fun quack()
}

interface Turkey {
    fun turkeyFly()
    fun gobble()
}


class WildDuck: Duck {
    override fun fly() {
        println("I'm flying as a duck!")
    }

    override fun quack() {
        println("I'm quacking!")
    }
}

class CoolTurkey: Turkey {
    override fun turkeyFly() {
        println("I'm flying as turkey")
    }

    override fun gobble() {
        println("I'm gobbling!")
    }
}