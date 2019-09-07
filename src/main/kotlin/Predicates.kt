fun main(args : Array<String>){

    //Condition that returns true or false
    //all  do all elements satisfy the predicates or condition
    //any do any element satisfy the predicates or condition
    //count total element satisfy the predicates or condition
    //find return the first element the satisfy the predicates or condition

    val myPredicate = {num:Int -> num > 5}

    val predicat = listOf<Int>(4,7,2,90,156)
    val check1 = predicat.all (myPredicate)    //{p -> p > 5} or {it > 5}
    println(check1)

    val check2 = predicat.any(myPredicate)
    println(check2)

    val check3 = predicat.count(myPredicate)
    println(check3)

    val check4 = predicat.find { it > 5 }
    println(check4)
}