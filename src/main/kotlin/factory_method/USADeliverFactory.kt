package factory_method

class USADeliverFactory:DeliverFactory() {
    override fun createDelivery(country: Country): Delivery {
        return WaterDelivery(WaterDeliveryType.SEA)
    }
}