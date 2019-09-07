fun main(args: Array<String>){
    var men1 = Men("Roy",24)
    println(men1)

    var men2 = men1.copy(name = "Mac", age = 38)       //copy method
    println(men2)
}

data class Men(var name:String,var age:Int){
    //data class
}