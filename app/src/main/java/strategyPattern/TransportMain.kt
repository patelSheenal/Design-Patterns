package strategyPattern

class TransportMain {
    companion object{
        @JvmStatic
        fun main(array: Array<String>){
            val client = TravellingClient(Aeroplane())
            println(client.howToTravel())
        }
    }
}