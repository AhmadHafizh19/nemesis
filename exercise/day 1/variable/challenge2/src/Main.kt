//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Tahun lahir: "); val tahunLahir = readLine()?.toIntOrNull() ?: 0
    print("Tahun sekarang: "); val tahunSekarang = readLine()?.toIntOrNull() ?: 0

    val usia = tahunSekarang - tahunLahir
    println("Usia Anda: $usia tahun")
}