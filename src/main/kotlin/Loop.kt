fun main(args: Array<String>){
    for (i in 1..3){
        //in kotlin for loop use range
        println("Hello!")
        if (i == 2){
            break
        }
    }

    var j:Int = 1
    while (j <= 10){
        if (j % 2 != 0){
            println(j)
        }
        j++
    }

    var k:Int = 0
    do {
        println("Welcome")
        k++
    }while (k < 3)


    //@label @Outer loop @Inner loop @break @continue

    
    var m:Int = 1
    //outer loop
    //outer loop label
    outer@ for (m in 1..3){
        for (n in 1..3){
            //inner loop
            println("$m $n")
            if (m == 2 && n == 2)
                break@outer
        }
    }

    var l:Int = 1
    loop@ for (l in 1..3){
        for (q in 1..3){
            if (l == 2 && q == 2){
                continue
            }
            println("$l $q")
        }
    }
}