fun main(args: Array<String>){

    //var = mutable --- Can change
    //val = immutable --- Can't change

    println("Hello Kotlin! I am here....Let's fun!!!")

    ///String : String
    val name: String? = readLine()
    println("I am $name")

    ///Integer number : Int
    val num1: Int = 10
    val num2: Int = 101

    println("sum of $num1 and $num2 is ${num1 + num2}")

    ///Double number : Double
    val doubleNum1: Double = 2.3000
    val doubleNum2: Double = 67.90
    val sumOfDouble: Double = doubleNum1 / doubleNum2
    println("Divide of double numbers is : $sumOfDouble")

    ///Float number : Float
    val floatNum1: Float = 1.56f
    val floatNum2: Float = 3.8f * floatNum1
    println("$floatNum1 multiple $floatNum2 is : ${floatNum1 * floatNum2}")

    var characterName: String = "Dipto"
    characterName = "Roy"
    print(characterName)



}