import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a1 = scanner.nextInt()
    val a2 = scanner.nextInt()
    val a3 = scanner.nextInt()
    val a4 = scanner.nextInt()
    val a5 = scanner.nextInt()
    println(a5 in a1..a2 && a5 in a3..a4)
}