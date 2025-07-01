//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nilai ujian: "); val nilai = readLine()?.toDoubleOrNull() ?: 0.0

    val skala = nilai / 25

    println("Nilai ${nilai.toInt()} → skala 4.0 = ${String.format("%.2f", skala)}")
}