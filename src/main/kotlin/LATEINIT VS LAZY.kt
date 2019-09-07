// LAZY -> use it mutable variable var,val
//LAZY -> allowed nullable and non-nullable data types
val gdp:Int by lazy { 5 }

fun main(args : Array<String>){

    // LATEINIT -> use it only mutable variable var,val is not allowed
    //LATEINIT -> allowed only non-nullable data types

    val c = Country()
    c.name = "Bangladesh"
    println(c.name)

    val bdGdp = gdp * 1200
    println(bdGdp)

}

class Country{
    lateinit var name:String
}