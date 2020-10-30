import kotlin.math.floor
import kotlin.math.sqrt

/*
This solution is good. But it is O(n) and if you
take more than 10000 length will be timeout(1200s)
 */

//fun rectangleRotation(a: Int, b: Int): Int {
//
//    var point = 0
//    val diagonal = ceil(sqrt((a / 2).toDouble().pow(2) + (b / 2).toDouble().pow(2))).toInt()
//
//    for (i in -diagonal..diagonal) {
//        for (j in -diagonal..diagonal) {
//            val x = i*cos(Math.toRadians(-45.0)) - j*sin(Math.toRadians(-45.0))
//            val y = i*sin(Math.toRadians(-45.0)) + j*cos(Math.toRadians(-45.0))
//
//            if (x <= a / 2 && -a / 2 <= x && y <= b / 2 && -b / 2 <= y) {
//                point++
//            }
//        }
//    }
//
//    return point
//}

fun rectangleRotation(a: Int, b: Int): Int {
    val aHalf = (a / sqrt(2.0)) / 2
    val bHalf = (b / sqrt(2.0)) / 2
    val rectOne = arrayOf(floor(aHalf) * 2 + 1, floor(bHalf) * 2 + 1)
    var rectTwo = arrayOf(0.0, 0.0)

    if (aHalf - floor(aHalf) < 0.5) {
        rectTwo[0] = rectOne[0] - 1
    } else {
        rectTwo[0] = rectOne[0] + 1
    }

    if (bHalf - floor(bHalf) < 0.5) {
        rectTwo[1] = rectOne[1] - 1
    } else {
        rectTwo[1] = rectOne[1] + 1
    }

    return (rectOne[0] * rectOne[1] + rectTwo[0] * rectTwo[1]).toInt()
}