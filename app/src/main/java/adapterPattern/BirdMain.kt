package adapterPattern

class BirdMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ouyTurkey = CoolTurkey()
            val wrappedTurkey = TurkeyAdapter(ouyTurkey)
            wrappedTurkey.fly()
            wrappedTurkey.quack()
        }
    }
}