//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun konversiSuhu(celcius: Double): Double {
    return (celcius * 9 / 5) + 32
}

fun main() {
    print("Input suhu (celcius): "); val celcius = readLine()?.toDouble() ?: 0.0
    val fahrenheit = konversiSuhu(celcius)
    println("Suhu dalam Fahrenheit: ${String.format("%.2f", fahrenheit)}")
}