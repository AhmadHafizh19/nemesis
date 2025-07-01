//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var total = 0
    val attempts = 5

    for (i in 1..attempts) {
        print("Input nilai: ")
        val score = readLine()?.toIntOrNull() ?: 0
        total += score
    }

    val average = total / attempts
    println("Total: $total \nRata-rata: $average")
}