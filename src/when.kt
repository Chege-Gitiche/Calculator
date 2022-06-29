import kotlin.math.log

fun main(args:Array<String>) {
    var gari="BMW"
    when(gari){
        "Nissan" -> println("My car is nissan")
        "Toyota" -> println("My car is Toyota")
        "BMW"-> println("My car is a BMW")
        else -> println("Invalid input")
    }
    for (n in 4..12){
        println("before continue: Loop $n")
        if (n==7||n==10)
            continue
        println("after continue:Loop $n")
    }
    for (s in 15..39){
        println("The number is "+s)
        if (s==32){
            println("stop")
            break
        }
    }

}