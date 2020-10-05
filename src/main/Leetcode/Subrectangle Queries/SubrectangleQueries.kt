class SubrectangleQueries(private val rectangle: Array<IntArray>) {

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (i in row1..row2) {
            for (j in col1..col2) {
                rectangle[i][j] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return if (row in rectangle.indices) {
            if (col in rectangle[row].indices) {
                rectangle[row][col]
            } else
                -1
        } else {
            -1
        }
    }

    fun print() {
        for (i in rectangle.indices) {
            for (j in rectangle[i].indices) {
                print(rectangle[i][j])
                print(" ")
            }
            println()
        }
    }

}