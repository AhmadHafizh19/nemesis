import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val correctUsername = "admin"
    val correctPassword = "1234"

    print("Username: "); val username = readLine()
    print("Password: "); val password = readLine()

    val correctAccount = username == correctUsername && password == correctPassword

    if (correctAccount) {
        println("Login berhasil!")
    } else {
        println("Username/password salah.")
    }
}