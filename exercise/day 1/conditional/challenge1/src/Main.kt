//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nilai: "); val score = readLine()?.toIntOrNull() ?: 0

    val grade = when {
        score in 85..100 -> "A"
        score in 70..84 -> "B"
        score in 60..69 -> "C"
        score in 50..59 -> "D"
        else -> "E"
    }

    println("Predikat: $grade")
}