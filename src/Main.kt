fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    println(compareTwoNumbers(timeSpentToday, timeSpentYesterday))
}

fun compareTwoNumbers(timeSpentToday : Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
