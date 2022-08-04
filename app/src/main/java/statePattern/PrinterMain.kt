package statePattern

class PrinterMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val printing = Printer()
            printing.startPrinting() // Printed Successfully.
            printing.startPrinting() // Printed Successfully.
            printing.startPrinting() // Printer doesn't have ink.
            printing.installInk() // Ink installed.
            printing.startPrinting() // Printed Successfully.
        }
    }
}