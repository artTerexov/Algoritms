//if these g-gap prime numbers don't exist return []
fun gap(g:Int, m:Long, n:Long):LongArray {
    var firstNum: Long
    val array = LongArray(2)
    val list = arrayListOf<Long>()

    for (i in m..n) {
        if (isPrime(i)) {
            list.add(i)
        }
    }

    for (i in 0 until list.lastIndex) {
        firstNum = list[i]
        if (list[i + 1] - firstNum == g.toLong()) {
            array[0] = firstNum
            array[1] = list[i + 1]
            return array
        }
    }

    return LongArray(0)
}

fun isPrime(m: Long): Boolean {
    var d = 2
    while (d * d <= m && m % d != 0L) {
        d += 1
    }
    return d * d > m
}