//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Angka A: "); val a = readLine()?.toIntOrNull() ?: 0
    print("Angka B: "); val b = readLine()?.toIntOrNull() ?: 0

    val larger = if (a > b) a else b

    println("Angka lebih besar: $larger")
}