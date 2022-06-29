import kotlin.math.sqrt

fun calc(){
    var num1=46
    var num2 =232
    println("The sum of $num1 and $num2 is "+(num1+num2))
    println("The product of $num1 and $num2 is "+(num1*num2))
    println("The subtraction of $num1 and $num2 is "+(num1-num2))
    println("The quotient of $num1 and $num2 is "+(num2/num1))
}
fun main(args: Array<String>) {
    calc()
    name()
    println(sqrt(78.23))
    cars("Volkswagen","blue")
}
fun name(){

    println("My name is  Josh")
}
fun cars(Name:String,color:String){
    println("Car brand "+Name)
    println("Car color $color")
}