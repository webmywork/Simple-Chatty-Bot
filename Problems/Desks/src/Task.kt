import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val f = scanner.nextInt()
    val f1 = scanner.nextInt()
    val f2 = scanner.nextInt()
    var k:Int
    var k1:Int
    var k2:Int
    if(f % 2 == 1){
        k=(f+1)/2
    }
    else {
        k = f/2
    }
    if(f1 % 2 == 1){
        k1=(f1+1)/2
    }
    else {
        k1 = f1/2
    }
    if(f2 % 2 == 1){
        k2=(f2+1)/2
    }
    else {
        k2 = f2/2
    }
    println(k+k1+k2)
}