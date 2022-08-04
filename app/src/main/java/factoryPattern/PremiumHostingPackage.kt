package factoryPattern

class PremiumHostingPackage: HostingPackageInterface {
    override fun getService(): List<String> {
        return listOf("spa", "breakfast", "dinner", "tour")
    }
}