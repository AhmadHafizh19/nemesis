//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun add(a: Int, b: Int): Int = a + b
fun subtract(a: Int, b: Int): Int = a - b
fun multiply(a: Int, b: Int): Int = a * b
fun divide(a: Int, b: Int): Int = a / b

fun main() {
    print("Input angka pertama: "); val num1 = readLine()?.toIntOrNull() ?: 0
    print("Input angka kedua: "); val num2 = readLine()?.toIntOrNull() ?: 0
    print("Pilih operasi: "); val operator = readLine()

    val result = when (operator) {
        "+" -> add(num1, num2)
        "-" -> subtract(num1, num2)
        "*" -> multiply(num1, num2)
        "/" -> divide(num1, num2)
        else -> {
            println("Operator tidak valid")
            return
        }
    }
    println("Hasil: $result")
}