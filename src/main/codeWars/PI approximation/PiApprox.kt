import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.pow

object PiApprox {
    fun iterPi2String(epsilon: Double): String {
        var result = 1.0
        var delta = 1.0
        var n = 1

        while (delta > epsilon) {
            result += (-1.0).pow(n) / (2 * n + 1)
            n++
            delta = abs(PI - (4.0 * result))
        }

        return String.format("[%d, %.10f]", n, result * 4)
    }
}