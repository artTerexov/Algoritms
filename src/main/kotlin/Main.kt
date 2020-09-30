@file:Suppress("UNCHECKED_CAST")

import java.util.*

fun main() {
//    println(sum(intArrayOf(1, 2, 4, 6)))
//    println(numberOfElements(intArrayOf(1, 2, 4, 6)))
//    println(maxValue(intArrayOf(1, 7 ,2, 4)))
//    println(binarySearch(intArrayOf(1, 2 ,3, 4, 5, 6, 7, 8, 9), 7))

    // Объявление переменных
    val simpleList = arrayListOf(3, 4, 7, 66, 99, 3, 5, 9)
    val simpleHastList = hashMapOf<String, Array<String>>()
    simpleHastList["Я"] = arrayOf("Боб", "Клэр", "Алиса")
    simpleHastList["Боб"] = arrayOf("Анудж", "Пэгги")
    simpleHastList["Клэр"] = arrayOf("Томм", "Джонни")
    simpleHastList["Алиса"] = arrayOf("Пэгги")

//    simpleHastList.keys.forEach {
//        print(" $it")
//    }
    //  Поиск в ширину
    widthSearch(simpleHastList)

    // Неотсортированный список
    print("\nUnsorted list:")
    simpleList.forEach {
        print("   $it")
    }

    // Сортировка выбором
    print("\nSelected sort:")
    selectedSort(simpleList.clone() as MutableList<Int>).forEach {
        print("   $it")
    }

    // Быстрая сортировка
    print("\nQuick sort:   ")
    quickSort(simpleList.clone() as MutableList<Int>).forEach {
        print("   $it")
    }

    print("\n")
    val q = PriorityQueue<Pair<Int, Int>>()
    q.add(Pair(1, 7))
    q.add(Pair(2, 9))
    q.add(Pair(3, 5))
    q.add(Pair(4, 1))
    q.add(Pair(5, 8))
    q.add(Pair(6, 6))
    q.add(Pair(7, 3))
    q.add(Pair(8, 4))

    while (q.isNotEmpty()) {
        println(q.remove())
    }
}