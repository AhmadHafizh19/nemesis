//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nama mahasiswa: "); val nama = readLine()
    print("Apakah mahasiswa aktif? "); val status = readLine()?.toBoolean() ?: "false"

    println("\nNama: $nama \nMahasiswa Aktif: $status")
}