import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val line1 = (scanner.nextInt()).toDouble()
    val math = Math.cbrt(line1)
    println(math.toInt())
}