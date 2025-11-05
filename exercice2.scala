class Order(var orderId: Int, val orderDate: String, val orderCustomerId: Int, val orderStatus: String) {
    println("Je suis dans le constructeur")
    override def toString = "Order("+ orderId+ ","+ orderDate + ","+
    orderCustomerId + ","+ orderStatus +")"
}
var order = new Order(1, "2013-10-01 00:00:00.00",100, "COMPLETE")

println(order.orderId)
order.orderId = 2
println(order.orderId)
