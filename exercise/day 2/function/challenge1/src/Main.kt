//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun luasPersegi(side: Int): Int {
    return side * side
}

fun main() {
    print("Input sisi: "); val side = readLine()?.toIntOrNull() ?: 0
    val area = luasPersegi(side)
    println("Luas persegi: $area")
}

