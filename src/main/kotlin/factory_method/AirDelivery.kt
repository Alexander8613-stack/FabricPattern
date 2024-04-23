package factory_method

class AirDelivery(private val type: AirDeliveryType,private val transportType: AirTransportType):Delivery() {
    override val companyName: String
        get() = "Air Transport Inc."

    override val maxWeight: Double
        get() = 1000.0

    override val maxDimensions: Dimensions
        get() = Dimensions(10,10,10)

    override fun deliver(goods: Goods) {
        println("Доставка груза авиатранспортом: ${goods.name} (type: $type, transportType: $transportType")
    }
}