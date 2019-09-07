fun main(args: Array<String>){

    val roll: List<Int> = listOf<Int>(201,176,150,190,278,305)
    val filter = roll.filter { filter -> filter < 200 }
    for (fil in filter){
        println(fil)
    }

    println()

    val height = listOf<Int>(3,4,6,8,2)
    val triangle = height.map { h -> .5 * 3 * h}
    for (tri in triangle){
        println(tri)
    }

    println()

    var production= listOf<Pre>(Pre(3,5),Pre(4,9),Pre(4,230))
    var totalCost = production.map { p -> p.productPrice }.filter { p -> p > 5 }
    for (t in totalCost){
        println(t)
    }

}

class Pre(var quatity:Int,var productPrice:Int){

}