package commandPattern

interface Command{
    fun execute()
}

class OnCommand(private val ce: ConsumerElectronics) : Command{
    override fun execute() {
        ce.on()
    }
}

class MuteAllCommand(internal var ceList: List<ConsumerElectronics>): Command {
    override fun execute() {
        for(ce in ceList){
            ce.mute()
        }
    }
}

interface ConsumerElectronics {
    fun on()
    fun mute()
}

class Television : ConsumerElectronics {

    override fun on() {
        println("Television is on!")
    }

    override fun mute() {
        println("Television is muted!")
    }
}

class SoundSystem : ConsumerElectronics {

    override fun on() {
        println("Sound system is on!")
    }
    override fun mute() {
        println("Sound system is muted!")
    }
}

class Button(var c: Command){
    fun click(){
        c.execute()
    }
}