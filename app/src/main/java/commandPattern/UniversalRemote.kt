package commandPattern

class UniversalRemote {
    fun getActiveDevice() : ConsumerElectronics{
        val tv = Television()
        return tv
    }
}