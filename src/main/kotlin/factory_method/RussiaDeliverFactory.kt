package factory_method

class RussiaDeliverFactory:DeliverFactory() {
    override fun createDelivery(country: Country): Delivery {
        return RailDelivery(RailGauge.STANDARD,RailTrackType.WITH_BALLAST)
    }
}