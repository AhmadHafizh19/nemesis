//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Masukkan angka pertama: "); val firstNumber = readLine()?.toDoubleOrNull() ?: 0.0
    print("Operator: "); val operator = readLine()
    print("Masukkan angka kedua: "); val secondNumber = readLine()?.toDoubleOrNull() ?: 0.0

    val result = when (operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> firstNumber / secondNumber
        else -> println("Operator tidak valid.")
    }

    println("Hasil: $result")
}