fun main(args: Array<String>){

    var studentroll = Array<Int>(5) {0}      //mutable,fixed size
    studentroll[0] = 2011
    studentroll[1] = 2012
    studentroll[2] = 2013
    studentroll[3] = 2014
    studentroll[4] = 2015

    var studentname = listOf<String>("Mehedi","Amir","Ronjan")      //immutabe,fixed size

    var subject = mutableListOf<String>()      //mutable and no fixed size likes arrayListOf<>(),arrayList<>()
    subject.add("History")
    subject.add("Biography")
    subject.add("English")
    subject.remove("History")
    subject.add(0,"Math")

    for (element in studentroll){
        println(element)
    }

    println()

    for (index in 3 until studentroll.size){      //using ranges
        println(studentroll[index])
    }

    println()

    for (element in studentname){
        println(element)
    }

    println()

    for (element in subject){
        println(element)
    }

}