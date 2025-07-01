//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Input: "); val text = readLine() ?: ""
    print("Jumlah: "); val attempts = readLine()?.toIntOrNull() ?: 0

    for (i in 1..attempts) {
        println(text)
    }
}