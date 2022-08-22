fun main()
{
    var car1=Car("Audi RS 8","8",6000000,"Vijay Dabhi",700000)

    println("${car1.displayCarInfo()}")
}
class Car constructor(type:String, model:String, price:Long, owner:String, originalPrice:Long)
{
    var type:String=type
    var model:String=model
    var price:Long=price
    var owner:String=owner
    var originalPrice:Long=originalPrice

    fun displayCarInfo():String{
        return "Car: $type\nModel:$model\nprice:$price\nOwner:$owner\noriginal pric :$originalPrice"
    }
}