//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val secretNumber = 7
    var attempts = 0

    do {
        println("Masukkan angka: ")
        val guess = readLine()?.toIntOrNull() ?: 0
        attempts++
    } while (guess != secretNumber)

    println("Tebakan Anda benar! Jumlah percobaan: $attempts")
}