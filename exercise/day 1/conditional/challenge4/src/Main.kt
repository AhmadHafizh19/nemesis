//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Menu:")
    println("1. Nasi Goreng")
    println("2. Mie Ayam")
    println("3. Ayam Geprek")
    print("Pilihan: ")
    val choice = readLine()?.toIntOrNull()

    val menu = when (choice) {
        1 -> "Nasi Goreng"
        2 -> "Mie Ayam"
        3 -> "Ayam Geprek"
        else -> null
    }

    val message = if (menu != null) "Kamu memilih: $menu" else "Menu tidak tersedia"
    println(message)
}