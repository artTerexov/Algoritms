fun rgb(r: Int, g: Int, b: Int): String {
    return decimalToHex(r) + decimalToHex(g) + decimalToHex(b)
}

fun decimalToHex(num: Int): String {
    if (num in 0..255) {
        return if (num < 16) {
            "0" + num.toString(16).toUpperCase()
        } else {
            num.toString(16).toUpperCase()
        }
    } else {
        val b =  if (num < 0) {
            0
        } else {
            255
        }
        return if (b < 16) {
            "0" + b.toString(16).toUpperCase()
        } else {
            b.toString(16).toUpperCase()
        }
    }
}
//fun rgb(r: Int, g: Int, b: Int) = String.format("%02X%02X%02X", r.coerceIn(0..255), g.coerceIn(0..255), b.coerceIn(0..255))