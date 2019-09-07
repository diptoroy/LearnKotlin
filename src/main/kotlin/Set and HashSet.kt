fun main(args: Array<String>){

    //set contains unique elements
    //HashSet contains unique element but sequence is not guaranteed in output

    var mySet = setOf<Int>(234,567,890,867)    //immutable,read only,fixed size

    for (element in mySet){
        println(element)
    }

    println()

    var myHashSet = hashSetOf<String>()     //mutable,read and write both,no fixed size
    myHashSet.add("Bangladesh")
    myHashSet.add("USA")
    myHashSet.add("China")

    for (element in myHashSet){
        println(element)
    }


}