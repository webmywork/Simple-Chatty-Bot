import java.util.*

// write your code here
fun getLastDigit(a: Int): Int{
    var num = a
    if(num<0){
        num = -num
    }
   return num % 10
}
/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}