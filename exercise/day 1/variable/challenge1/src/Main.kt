//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nama: "); val nama = readln()
    print("Umur: "); val umur = readln().toIntOrNull() ?: 0
    print("Kota: "); val kota = readln()

    println("\nNama: $nama \nUmur: $umur Tahun \nKota: $kota")
}