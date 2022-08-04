package commandPattern

class CommandMain {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            // OnCommand is instantiated based on active device supplied by Remote
            val ce = UniversalRemote().getActiveDevice()
            val onCommand = OnCommand(ce)
            val onButton = Button(onCommand)
            onButton.click()

            val all = listOf(Television(), SoundSystem())
            val muteAll = MuteAllCommand(all)
            val muteAllButton = Button(muteAll)
            muteAllButton.click()
        }
    }
}