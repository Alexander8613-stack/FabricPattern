package factory_method

class BelarusDeliverFactory:DeliverFactory() {
    override fun createDelivery(country: Country): Delivery {
        return RoadDelivery()
    }
}