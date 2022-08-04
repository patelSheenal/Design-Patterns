package factoryPattern

class StandardHostingPackage: HostingPackageInterface {
    override fun getService(): List<String> {
        return listOf("tour", "stay", "breakfast")
    }
}