package factory_method

class DefaultDeliverFactory:DeliverFactory() {
    override fun createDelivery(country: Country): Delivery {
        return RoadDelivery()
    }
}