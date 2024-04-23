package factory_method

abstract class Delivery {
    abstract val companyName :String
    abstract val maxWeight:Double
    abstract val maxDimensions:Dimensions

    abstract fun deliver(goods: Goods)
}