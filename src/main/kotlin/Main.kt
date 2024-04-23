import factory_method.*

fun main(args: Array<String>) {
    val country = Country.USA
    val factory :DeliverFactory = when(country){
        Country.USA -> USADeliverFactory()
        Country.GERMANY ->GermanyDeliveryFactory()
        Country.RUSSIA -> RussiaDeliverFactory()
        Country.BELARUS -> BelarusDeliverFactory()
        else -> DefaultDeliverFactory()
    }

    val delivery:Delivery = factory.createDelivery(country)

    println("Детали грузоперевозки:")
    println("Название компании: ${delivery.companyName}")
    println("Максимальная грузоподъемность: ${delivery.maxWeight} кг")
    println("Максимальные габариты: ${delivery.maxDimensions} см")

    val goods = Goods("Goods for $country")
    delivery.deliver(goods)

    println("Грузы доставлены")
}