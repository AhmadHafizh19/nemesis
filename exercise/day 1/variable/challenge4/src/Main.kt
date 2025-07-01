//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Barang: "); val namaBarang = readLine()
    print("Jumlah: "); val jumlah = readLine()?.toIntOrNull() ?: 0
    print("Harga satuan: "); val hargaSatuan = readLine()?.toDoubleOrNull() ?: 0.0

    val total = jumlah * hargaSatuan

    println("\nBarang: $namaBarang \nJumlah: $jumlah \nHarga satuan: $hargaSatuan \nTotal: $total")
}
