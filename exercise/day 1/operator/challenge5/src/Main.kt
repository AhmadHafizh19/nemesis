//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Umur: "); val age = readLine()?.toIntOrNull() ?: 0
    print("Member: "); val isMember = readLine()?.toBoolean() ?: "false"

    val canEntry = age > 21 && isMember == true
    val status = if (canEntry) "Boleh masuk" else "Tidak boleh masuk"
    println("Status: $status")
}