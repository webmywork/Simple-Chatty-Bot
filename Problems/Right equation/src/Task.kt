import java.util.*

// write your code he
fun isRightEquation(a: Int, b: Int, c: Int): Boolean {
    if (a * b == c) {
        return true
    }
    return false
}
/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(isRightEquation(a, b, c))
}
