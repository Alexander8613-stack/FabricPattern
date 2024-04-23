package factory_method

class WaterDelivery(private  val type: WaterDeliveryType):Delivery() {
    override val companyName: String
        get() = when(type){
            WaterDeliveryType.SEA -> "Sea Transport Inc."
            WaterDeliveryType.RIVER -> "River Transport Inc."
        }

    override val maxWeight: Double
        get() = when(type){
            WaterDeliveryType.SEA -> 10000.0
            WaterDeliveryType.RIVER -> 5000.0
        }

    override val maxDimensions: Dimensions
        get() = when(type){
            WaterDeliveryType.SEA -> Dimensions(20,20,20)
            WaterDeliveryType.RIVER -> Dimensions(15,15,15)
        }

    override fun deliver(goods: Goods) {
        println("Доставка груза водным транспортом: ${goods.name} ($type)")
    }
}