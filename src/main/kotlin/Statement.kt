fun main(args: Array<String>){

    ///simple volt,when put right password it's open!let's fun more

    println("!!!!!!! VOLT !!!!!!!")
    println("Put your password carefully....")

    val voltPassword: String? = readLine()

    if (voltPassword == "Bf0022562" && voltPassword != null){
        println("Welcome Dipto Roy!!!!")
        println("Search your products....")
        val putThings: String? = readLine()
        when(putThings){
            "Diamond" -> println("3 pcs")
            "Cash" -> println("2500 USD")
            "SecretThings" -> println("Bank paper")
            else -> println("Not Found!")
        }
    }else{
        println("Wrong Password!!!Please try again")
    }
}