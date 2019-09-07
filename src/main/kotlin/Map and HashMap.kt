fun main(args: Array<String>){

    var myMap = mapOf<Int , Double>(1 to 2.45,2 to 3.00,7 to 2.76)     //immutable,read only and fixed size

    for (key in myMap.keys)
    println("Roll number $key 's cgpa is ${myMap[key]} ")     //myMap.get(key)

    println()

    var myHashmap = HashMap<Int , String>()        //mutable,read and write both,no fixed size    //mutableMapOf(),hashMapOf()
    myHashmap.put(3, "Failed")
    myHashmap.put(7, "Good")
    myHashmap.put(9, "Average")

    for (key in myHashmap.keys){
        println("Roll number $key 's exam status is ${myHashmap[key]}")
    }
}


