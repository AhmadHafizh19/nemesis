import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val studentScores: MutableMap<String, MutableList<Int>> = mutableMapOf()

    while (true) {
        println("=== MENU NILAI SISWA ===")
        println("1. Tambah Nilai Siswa")
        println("2. Lihat Semua Data")
        println("3. Cari Nilai Tertinggi")
        println("4. Siswa yang Lulus")
        println("5. Keluar")
        print("\nPilih menu: ")

        when (readLine()?.toIntOrNull()){
            1 -> {
                print("Nama Siswa: "); val name = readLine() ?: continue
                print("Nilai Siswa (pisahkan dengan koma): "); val scores = readLine()?.split(",")?.mapNotNull { it.toIntOrNull() }?.toMutableList() ?: mutableListOf()

                if (studentScores.containsKey(name)) {
                    studentScores[name]?.addAll(scores)
                } else {
                    studentScores[name] = scores
                }
                println("Data siswa $name berhasil ditambahkan.\n")
            }

            2 -> {
                if (studentScores.isEmpty()) {
                    println("Belum ada data siswa.\n")
                } else {
                    for ((name, scores) in studentScores) {
                        val average = if (scores.isNotEmpty()) scores.average() else 0.0
                        println("Nama: $name")
                        println("Nilai: ${scores.joinToString(", ")}")
                        println("Rata-rata: ${"%.2f".format(average)}\n")
                    }
                }
            }

            3 -> {
                if (studentScores.isEmpty()) {
                    println("Belum ada data siswa.\n")
                } else {
                    var highestScoreName = ""
                    var highestScore = Int.MIN_VALUE
                    for ((name, scores) in studentScores) {
                        val maxScore = scores.maxOrNull() ?: Int.MIN_VALUE
                        if (maxScore > highestScore) {
                            highestScore = maxScore
                            highestScoreName = name
                        }
                    }
                    println("Nama: $highestScoreName")
                    println("Nilai tertinggi: $highestScore\n")
                }
            }

            4 -> {
                if (studentScores.isEmpty()) {
                    println("Belum ada data siswa.\n")
                } else {
                    println("Siswa yang lulus:")
                    for ((name, scores) in studentScores) {
                        val average = if (scores.isNotEmpty()) scores.average() else 0.0
                        if (average >= 75) {
                            println("Name: $name, Average: ${"%.2f".format(average)}")
                        }
                    }
                    println()
                }
            }

            5 -> {
                println("Keluar dari program.")
                break
            }

            else -> {
                println("Pilihan menu tidak sesuai. Coba lagi!.\n")
            }
        }
    }
}