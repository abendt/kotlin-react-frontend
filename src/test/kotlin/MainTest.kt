import kotlin.test.*


class HelloTest {
    @Test
    fun testHello() {
        assertEquals("Hello World", hello("World"))
    }
}