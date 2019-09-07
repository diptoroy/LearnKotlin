fun main(args: Array<String>){

    var r1: IntRange = 1..5
    //The range contains the number 1,2,3,4,5
    println(r1)

    val r2 = 5 downTo 1
    //The range contains the number 5,4,3,2,1
    println(r2)

    val r3 = 1 downTo 5 step 2
    //The range contains the number 1,3,5
    println(r3)

    val r4 = 'a'..'z'
    //The range contains the number a,b,c,d,e,f....z
    println(r4)

    val isPresent = 'c' in r4
    //c is present in r4 so it's true
    println(isPresent)

    val countDown = 10.downTo(1)
    println(countDown)


}