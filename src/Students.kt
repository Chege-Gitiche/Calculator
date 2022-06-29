class Students(var Name: String,var gender:String,var phoneno:Int,var ctaken:String) {
}

fun main(args: Array<String>) {
    var STD=Students("jack","Male",7680,"Eletrical engineering")
    println("The name is "+STD.Name )
    println("The gender is "+STD.gender)
    println("The number is "+STD.phoneno)
    println("The name is ${STD.Name} The gender is ${STD.gender} The phone number is ${STD.phoneno} The course taken is ${STD.ctaken}")
    println("The name is "+STD.Name, )
}


