import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите количество лайков")
    val likes = scanner.next()

    val likesStr = likes.toString()
    val likesCharArr = likesStr.toCharArray()
    if (likesCharArr.last() == '1') {
        println("Понравилось  $likes  человеку")
    } else println("Понравилось  $likes  людям")

}
