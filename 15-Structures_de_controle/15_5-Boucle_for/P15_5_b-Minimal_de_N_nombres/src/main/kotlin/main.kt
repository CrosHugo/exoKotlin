fun main() {
    val N = readln().toInt()
    val list = mutableListOf<Int>()
    for (i in 1..N){
        val K = readln().toInt()
        list.add(K)
    }
    println(list.min())
}



