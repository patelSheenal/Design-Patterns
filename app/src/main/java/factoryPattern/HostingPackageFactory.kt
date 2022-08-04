package factoryPattern

object HostingPackageFactory {
    fun getHostingFrom(type: HostingPackageType): HostingPackageInterface{
      return when(type){
            HostingPackageType.STANDARD -> StandardHostingPackage()
            HostingPackageType.PREMIUM -> PremiumHostingPackage()
        }
    }
}