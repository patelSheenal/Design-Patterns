package factoryPattern

import builderPattern.FoodOrder
import factoryPattern.HostingPackageFactory
import factoryPattern.HostingPackageType

class MyTourMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //Factory Pattern
           val mytour = HostingPackageFactory.getHostingFrom(HostingPackageType.PREMIUM)
            println(mytour.getService())
        }
    }
}