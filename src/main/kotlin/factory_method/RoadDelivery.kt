package factory_method

class RoadDelivery:Delivery() {
    override val companyName: String
        get() = "Road Transport Co."
    override val maxWeight: Double
        get() = 5000.0
    override val maxDimensions: Dimensions
        get() = Dimensions(20,20,20)

    override fun deliver(goods: Goods) {
        println("Доставка груза автотранспортом: ${goods.name}")
    }
}