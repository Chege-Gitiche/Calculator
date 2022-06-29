class num{
//    data member
    var num1:Int=67
    var num2:Int=39
    fun add():Int{
        return num1*num2
    }
}

fun main(args: Array<String>) {
//    Creating object
    val gh=num()
    println(gh.add())
}