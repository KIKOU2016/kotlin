infix fun distance(x: Int, y: Int) = x + y

fun test(): Int = 3 distance 4

fun testRegular(): Int = distance(3, 4)

class My(val x: Int) {
    operator fun invoke() = x
}

fun testInvoke(): Int = My(13)()