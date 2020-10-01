//My answer

fun maxSequence(arr: List<Int>): Int {
    var maxSeq = arr.max() ?: 0
    if (maxSeq < 0) {
        return 0
    }
    for (j in 1..arr.size) {
        for (i in 0..arr.size) {
            if (i + j > arr.size) {
                break
            }
            val sum = arr.subList(i, i + j).sum()
            if (maxSeq < sum) {
                maxSeq = sum
            }
        }
    }
    return maxSeq
}

// Best answer

//fun maxSequence(arr: List<Int>): Int {
//    var max = 0
//    arr.indices.forEach { outer ->
//        (outer..arr.size).forEach { inner ->
//            max = max(arr.subList(outer, inner).sum(), max)
//        }
//    }
//    return max
//}

// Favourite answer
//fun maxSequence(arr: List<Int>): Int {
//    var maxSum = 0
//    var sum = 0
//    for (eachNumber in arr) {
//        sum += eachNumber
//        maxSum = max(sum, maxSum)
//        sum = max(sum, 0)
//    }
//    return maxSum
//}