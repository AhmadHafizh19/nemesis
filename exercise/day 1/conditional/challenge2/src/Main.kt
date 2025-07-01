//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Masukkan umur: "); val age = readLine()?.toIntOrNull() ?: 0

    val category = when {
        age in 0..13 -> "Anak-anak"
        age in 13..19 -> "Remaja"
        age in 20..59 -> "Dewasa"
        age >= 60 -> "Lansia"
        else -> "Belum Lahir"
    }

    println("Umur: $age")
    println("Kategori: $category")
}