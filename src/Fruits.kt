class Fruits {
    var Type=""
    var color=""
    var price=0
}

fun main(args: Array<String>) {
    val Eat=Fruits()
    Eat.Type="Mango"
    Eat.price=96894
    Eat.color="Yellow"
println(Eat.Type)
    println(Eat.price)
    println(Eat.color)
    val T1=Fruits()
    T1.Type="Banana"
    T1.color="Green"
    T1.price=8536
    println(T1.Type)
    println(T1.color)
    println(T1.price)
}