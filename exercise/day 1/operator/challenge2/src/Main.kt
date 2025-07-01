//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nomor kursi: "); val numberSeat = readLine()?.toIntOrNull() ?: 0

    val status = if (numberSeat % 2 == 0) "Genap" else "Ganjil"
    println("Status: $status")
}
