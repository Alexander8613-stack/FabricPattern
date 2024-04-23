package factory_method

class RailDelivery(private  val gauge: RailGauge,private val trackType: RailTrackType):Delivery() {
    override val companyName: String
        get() = "Rail Transport Ltd."

    override val maxWeight: Double
        get() = 20000.0

    override val maxDimensions: Dimensions
        get() = Dimensions(30,30,30)

    override fun deliver(goods: Goods) {
        println("Доставка груза железнодорожным транспортом: ${goods.name} (gauge: $gauge,trackType: $trackType")
    }
}