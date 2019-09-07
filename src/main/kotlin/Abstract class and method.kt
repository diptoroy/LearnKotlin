fun main(args:Array<String>){
    var person = Bangladeshi()
    println("abstract variable in ${person.name}\n ${person.age}")
    person.Habbit()
}

abstract class Person{
    abstract var name:String
    open var age: Int = 23
    abstract fun Habbit()
}

class Bangladeshi:Person() {
    override var name: String = "Dipto Roy"
    override var age: Int = 24

    override fun Habbit(){
        println("He is a worst student")
    }
}