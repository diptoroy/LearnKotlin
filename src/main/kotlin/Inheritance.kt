fun main(args: Array<String>){

    var science = Science()
    science.name = "Ravi"
    science.age = 17
    science.school()
    science.education()
    println("${science.name}")
    println("${science.age}")


    var arts = Arts()
    arts.subject = "History"
    arts.age = 18
    arts.school()
    arts.education()
    println("${arts.subject}")
    println("${arts.age}")

    var details = StudentsDetails()
    details.age = 10
    details.school()

}
//In kotlin class,variable,method are by default public and static so we can use open keyword
open class StudentsDetails{
    var age: Int = 14

    open fun school(){
        println("London Secondary School")
    }
}

class Science: StudentsDetails(){
    var name: String = ""
    fun education(){
        println("Science Education")
    }
    override fun school(){
        super<StudentsDetails>.school()  //using super class in override method
        println("Three Lion Secondary School")
    }
}

class Arts: StudentsDetails(){
    var subject: String = ""
    fun education(){
        println("Arts Education")
    }
}