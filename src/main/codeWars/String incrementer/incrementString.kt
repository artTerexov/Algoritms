fun incrementString(str: String) : String {
    var newString = ""
    var sub = -1
    var number = 0
    var zeroNum = 0

    // Находим начало числа в конце строки
    for (i in str.length - 1 downTo 0) {
        if (!str[i].isDigit()) {
            sub = i
            break
        }
    }

    if (str.isNullOrEmpty())
        return "1"
    // Если цифр на конце строке нет цифр добавляем к строке единицу
    if (!str.contains(Regex("[1-9]"))) {
        return if (str.last() == '0') {
            str.substring(0, str.lastIndex) + '1'
        } else {
            str + '1'
        }
    }

    // Добавляем в новую строке все символы стоящие перед последним числом
    if (str.length > 1) {
        newString += str.substring(0, sub + 1)
    }

    for (i in sub + 1 .. str.lastIndex) {
        if (str[i] == '0') {
            zeroNum++
            continue
        } else {
            number = str.substring(i, str.length).toInt()
            number++
            break
        }
    }

    while (newString.length + number.toString().length < str.length) {
        newString += '0'
    }

    newString += number.toString()

    return newString
}

// Супер решение

//fun incrementString(str: String) : String {
//    val i = str.takeLastWhile { it.isDigit() }
//    return str.dropLast(i.length) + ((i.toIntOrNull() ?: 0) + 1).toString().padStart(i.length, '0')
//}