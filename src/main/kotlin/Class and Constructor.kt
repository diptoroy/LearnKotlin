fun main(args: Array<String>){
    var s1 = Student("Dipak",2200)
    println("${s1.roll}")
}

class Student(name: String){        //primary constructor
    var studentName: String = "Naim"
    var roll: Int = 2190

    init {           //init block
        this.studentName = name
        println("The name of the student is $studentName")
    }

    constructor(name: String,roll: Int):this(name){       //secondary constructor
        this.roll = roll
    }
 }