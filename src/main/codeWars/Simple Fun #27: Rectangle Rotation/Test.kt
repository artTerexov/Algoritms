import org.junit.Test
import kotlin.test.assertEquals

class TestKata {
    @Test
    fun basicTests() {
        assertEquals(23, rectangleRotation(6, 4))
        assertEquals(65, rectangleRotation(30, 2))
        assertEquals(49, rectangleRotation(8, 6))
        assertEquals(333, rectangleRotation(16, 20))
    }
}