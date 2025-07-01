//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Umur: "); val age = readLine()?.toIntOrNull() ?: 0
    print("Member VIP: "); val isVip = readLine()?.toBoolean() ?: false

    val canEntry = age > 18 && isVip == true
    val status = if (canEntry) "Diperbolehkan masuk" else "Tidak diperbolehkan masuk"
    println("Status: $status")
}