fun main(args: Array<String>){

    var program = Program()
    program.sum(10,8)

    program.sum(6,7,object : Simple{
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    val myLambda:(Int) -> Unit = {s:Int -> println(s)}
    program.sum(5,6,myLambda)

    val mySum:(Int,Int) -> Int = {i,j -> i + j}
    sum(9,9,mySum)
    sum(7,8,({i,j -> i + j}))       //another way
    sum(10,7){i,j -> i + j}       //another way

}

class Program{
    fun sum(a: Int,b:Int){                //Simple way
        var sum: Int = a + b
        println(sum)
    }

    fun sum(a: Int,b:Int,action: Simple){         //Using interface or OOP
        var sum: Int = a + b
        action.execute(sum)
    }

    fun sum(a: Int,b:Int,action:(Int)->Unit){         //High level function with lambda
        var sum: Int = a + b
        action(sum)
    }

}

interface Simple{
    fun execute(sum: Int)
}

fun sum(i: Int,j: Int,avd:(Int,Int)->Int){
    var mySum = avd(i,j)
    println(mySum)
}


