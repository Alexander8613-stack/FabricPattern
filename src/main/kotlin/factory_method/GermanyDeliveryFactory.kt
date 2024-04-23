package factory_method

class GermanyDeliveryFactory:DeliverFactory() {
    override fun createDelivery(country: Country): Delivery {
        return AirDelivery(AirDeliveryType.INTERCITY,AirTransportType.CARGO)
    }
}