fun main(args: Array<String>){
    var type = Type()
    type.test()

    var anothertest = AnotherTest()
    anothertest.anotherTest()


}

open class Number{         //Super class

    //by default in kotlin all method,class,variable are public and static
    //internal visible in same module
    //protected visible only sub class

    val a = 6
    private val b = 2
    internal val c = 4
    protected val d = 9

//    init {
//        println(b)
//    }
}

class Type:Number(){       //derived or sub class

    //a,c,d is visible
    //b is not visible

    fun test(){
        println("$a\n$c\n$d")
    }
}

class AnotherTest{
    fun anotherTest(){
        var number = Number()
        println("${number.a}\n${number.c}")
    }
}