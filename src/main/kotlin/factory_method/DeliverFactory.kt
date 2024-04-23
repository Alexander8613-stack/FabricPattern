package factory_method

abstract class DeliverFactory {
    abstract fun createDelivery(country: Country):Delivery

}