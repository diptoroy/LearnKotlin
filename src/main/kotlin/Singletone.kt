fun main(args: Array<String>){
    Products.productsName
    println("${Products.productsName}")
    Products.use()
    Products.testing("Hello")

    println("User id : ${Profile.id}")
    Profile.activity()

}
open class Test{
    open fun testing(str: String){
        println("This method use for testing!!!")
    }
}

object Products: Test(){                //likes java's static
    var productsName: String = "Soap"
    fun use(){
        println("Soap use for bath!")
    }

    override fun testing(str: String) {
       super.testing(str)
        println("Product testing $str")
    }

}

class Profile{
    companion object User{
        var id: Int = 210978
        fun activity(){
            println("User's activition complete")
        }
    }
}
