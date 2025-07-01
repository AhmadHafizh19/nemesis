//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    while(true){
        println("\nTampilkan Menu:")
        println("1. Lihat menu")
        println("2. Beli")
        println("3. Keluar")
        print("Pilihan: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> println("Nasi Goreng, Mie Ayam, Ayam Geprek")
            2 -> println("Beli menu")
            3 -> {
                println("Terima kasih telah berkunjung!")
                break
            }
            else -> println("Pilihan tidak valid")
        }
    }
}
