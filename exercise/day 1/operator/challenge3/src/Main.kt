//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Total belanja: "); val totalSpend = readLine()?.toDoubleOrNull() ?: 0.0

    var discount = 0.0
    val minSpend = 100_000
    if (totalSpend > minSpend) {
        discount = totalSpend * 0.10
    }
    val totalPay = totalSpend - discount

    println("\nTotal belanja: ${totalSpend.toInt()} \nDiskon: ${discount.toInt()} \nTotal bayar: ${totalPay.toInt()}")
}