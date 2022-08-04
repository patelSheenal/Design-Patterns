package statePattern
interface PrinterState{
    fun print()
}
class Ready: PrinterState{
    override fun print() {
        println("Printed successfully")
    }
}
class Noink: PrinterState{
    override fun print() {
        println("Printer does not have Ink")
    }
}
class Printer {
    private val noInk = Noink()
    private val ready = Ready()
    private var state: PrinterState = ready
    private var ink = 2

    private fun setPrinterState(state: PrinterState){
        this.state = state
    }

    fun startPrinting(){
        ink--
        if (ink >= 0) {
            setPrinterState(ready)
        } else {
            setPrinterState(noInk)
        }
        state.print()
    }

    fun installInk(){
        ink = 2
        println("Ink installed")
    }

}