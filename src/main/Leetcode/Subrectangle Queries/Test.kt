fun main() {

    val rectangle = Array<IntArray>(4) { intArrayOf(1, 1, 1) }
    val subrectangleQueries = SubrectangleQueries(rectangle)

    subrectangleQueries.print()
    subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5)

    subrectangleQueries.print()
}