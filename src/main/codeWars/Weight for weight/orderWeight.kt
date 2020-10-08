fun orderWeight(string:String):String {
    val oldList = string.split(" ")
    val newList = hashMapOf<Int, MutableList<String>>()
    var result = ""

    if (string.isBlank()) {
        return ""
    }

    for (weight in oldList) {
        var key = 0
        var value = ""
        weight.forEach {
            if (it != ' ') {
                key += it.toString().toInt()
                value += it
            }
        }
        if (key != 0) {
            if (newList.containsKey(key)) {
                newList[key]?.add(value)
            } else {
                newList[key] = mutableListOf(value)
            }
        }
    }

    for (i in newList.toSortedMap().values) {
        for (j in i.sorted()) {
            result += j
            result += " "
        }
    }

    return result.substring(0, result.length - 1)
}

//fun orderWeight(string:String):String {
//    return string.split(" ")
//            .sortedWith(compareBy<String>{ it.toCharArray().map(Char::toString).map(String::toInt).sum() }.thenBy{ it })
//            .joinToString(" ")
//}