fun main(args: Array<String>){
    calculate()
    var multi = multiple(9,9)
    println(multi)
    var maxNumber = max(90,12,19)
    println(maxNumber)
    var area = findArea(5,8,5)
    println("Area is $area")

    var x = 9
    var y = 18
    val addTwo = x.add(y)
    println(addTwo)
}

fun calculate(){
    var a:Int = 6
    var b:Int = 8
    println("${a + b}")
}

fun multiple(c: Int,d: Int):Int{
    return c * d
}

fun max(i: Int,j: Int,k: Int):Int =
    if (i > j && i > k){
        i
    }else if (j > i && j > k){
        j
    }else{
        k
    }

fun findArea(length: Int,breadth: Int,height: Int = 9) : Int{
    return length * breadth * height
}

//Extension Function
fun Int.add(a: Int): Int{
    return this + a
}
