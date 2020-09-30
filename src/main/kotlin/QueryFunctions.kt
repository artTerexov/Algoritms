fun sum(array: IntArray): Int {
    return if (array.isEmpty())
        0
    else {
        array[0] + sum(array.copyOfRange(1, array.size))
    }
}

fun numberOfElements(array: IntArray): Int {
    return if (array.isEmpty())
        0
    else {
        1 + numberOfElements(array.copyOfRange(1, array.size))
    }
}

fun maxValue(array: IntArray): Int {
    if (array.size == 2) {
        return if (array[0] > array[1]) {
            array[0]
        } else
            array[1]
    }
    val subMax = maxValue(array.copyOfRange(1, array.size))
    return if (array[0] > subMax) {
        array[0]
    } else {
        subMax
    }
}

//Бинарный поиск
fun binarySearch(array: IntArray, i: Int): Int {
    if (array[0] == i && array.size == 1) {
        return array[0]
    }
    return if (i > array[array.size / 2 - 1]) {
        binarySearch(array.copyOfRange(array.size / 2, array.size), i)
    } else {
        binarySearch(array.copyOfRange(0 , array.size / 2), i)
    }
}

//Алгоритм сортировка выбором
fun selectedSort(list: MutableList<Int>): MutableList<Int> {
    val sortArray = arrayListOf<Int>()

    fun smallestIndex(list: MutableList<Int>): Int {
        var minElem = list[0]
        var minIndex = 0
        for (i in 1 until list.size) {
            if (list[i] < minElem) {
                minElem = list[i]
                minIndex = i
            }
        }
        return minIndex
    }

    for (i in 0 until list.size) {
        val smallest = smallestIndex(list)
        sortArray.add(list[smallest])
        list.removeAt(smallest)
    }
    return sortArray
}

// Алгоритм быстрой сортировки
fun quickSort(list: MutableList<Int>): MutableList<Int> {
//    val finalList = arrayListOf<Int>()
    if (list.size < 2) {
        return list
    }
    val supportElem = list[list.size / 2]
    list.remove(supportElem)
    val lessELem = arrayListOf<Int>()
    val greaterELem = arrayListOf<Int>()
    for (i in list) {
        if (i <= supportElem) {
            lessELem.add(i)
        } else if (i > supportElem) {
            greaterELem.add(i)
        }
    }
    return (quickSort(lessELem) + arrayListOf(supportElem) + quickSort(greaterELem)) as ArrayList<Int>
}

// Алгоритм поиска в ширину
fun widthSearch(graph: HashMap<String, Array<String>>) {
    val searchQueue = ArrayDeque<String>()
    val checkArray = arrayListOf<String>()
    graph["Я"]?.forEach {
        searchQueue.add(it)
    }
    while (searchQueue.isNotEmpty()) {
        val person = searchQueue.first()
        searchQueue.removeFirst()
        if (!checkArray.contains(person)) {
            if (person == "Джонни") {
                print("You found Johny")
                return
            } else {
                graph[person]?.forEach {
                    searchQueue.add(it)
                }
                checkArray.add(person)
            }
        }
    }
    return
}
