import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var sum = 0

    repeat(n) {
        val next = scanner.nextInt()
        if(next>0) {
            sum++
        }
    }

    println(sum)
}