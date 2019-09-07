fun main(args: Array<String>){

    var maketing = Marketing("Anato","HR")

    var sell = Sell("Arash","2600$")


}
open class Employe(var name: String){

//    init {
//        println("Employe name $name")
//    }
}

class Marketing(name: String, var position:String): Employe(name){

    init {
        println("Empolye name $name and his position is $position")
    }
}

class Sell: Employe{
    var sallary: String = "2200$"
    constructor(name: String,sallary: String):super(name){
        println("Sell department empolye name $name and his sallary is $sallary")
    }
}