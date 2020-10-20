import org.junit.Assert.assertEquals
import org.junit.Test

class GapInPrimesTest {
    //--------------
    @Test
    fun test() {
        println("Fixed Tests")
        assertEquals("[101, 103]", gap(2, 100, 110).contentToString())
        assertEquals("[103, 107]", gap(4, 100, 107).contentToString())

    }
}