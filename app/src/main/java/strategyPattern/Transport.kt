package strategyPattern

interface TransportStrategy{
    fun travelMode() : String
}

class Car: TransportStrategy{
    override fun travelMode(): String {
        return "Road"
    }
}
class Ship: TransportStrategy{
    override fun travelMode(): String {
        return "Sea"
    }
}
class Aeroplane: TransportStrategy{
    override fun travelMode(): String {
        return "Air"
    }
}

class TravellingClient(var strategy: TransportStrategy) {
    fun update(strategy: TransportStrategy){
        this.strategy = strategy
    }

    fun howToTravel(): String{
        return "Travel by ${strategy.travelMode()}"
    }
}