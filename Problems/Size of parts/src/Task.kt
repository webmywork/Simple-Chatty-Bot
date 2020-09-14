import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0

    repeat(n) {
        val next = scanner.nextInt()
        if (next > 0) {
            a++
        }
        if (next < 0) {
            b++
        }
        if (next == 0) {
            c++
        }
    }

    println("${c} ${a} ${b}")
}
