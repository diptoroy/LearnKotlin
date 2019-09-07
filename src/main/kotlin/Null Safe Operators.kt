fun main(args : Array<String>){

    val name:String? = "Roy"
    //safe call(?)
    //return the length if "name" is not null else returns null
    //use it if user don't mind getting Null value
    println("The length of name is ${name?.length}")


    //safe call (.?)
    //It execute the block only if name is not null
    name?.let{
        println("The length of name is ${name.length}")
    }


    //elvis operator (?:)
    val len = name?.length ?: -1   //val len = if (name != null)name.length else -1





}