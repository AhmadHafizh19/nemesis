---
# 📄 **Pretest Kotlin & Basic Android Development (30 Soal)**
---

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

1. Apa tipe data untuk menyimpan teks di Kotlin?

   - a. `Char`
   - b. `Int`
   - c. `String`
   - d. `Double`

**Jawaban : c. `String`**

2. Kata kunci `val` digunakan untuk:

   - a. Variabel global
   - b. Variabel tetap (tidak bisa diubah)
   - c. Variabel bisa diubah
   - d. Fungsi cetak

**Jawaban : b. Variabel tetap (tidak bisa diubah)**

3. Apa hasil dari `println(5 + 3 * 2)`?

   - a. 16
   - b. 11
   - c. 13
   - d. 6

**Jawaban : b. 11**

4. Fungsi utama program Kotlin adalah:

   - a. `start()`
   - b. `main()`
   - c. `run()`
   - d. `launch()`

**Jawaban : b. `main()`**

5. Di Android Studio, layout antarmuka ditulis dengan:

   - a. Kotlin
   - b. Java
   - c. XML
   - d. JSON

6. Apa hasil dari kode berikut?

   ```kotlin
   val x = "4"
   println(x + 1)
   ```

   - a. 5
   - b. 41
   - c. Error
   - d. 14

**Jawaban : b. 41**

7. Fungsi `readLine()` dalam Kotlin digunakan untuk:

   - a. Menyimpan file
   - b. Menampilkan teks
   - c. Membaca input
   - d. Membuat variabel

**Jawaban : c. Membaca input**

8. Apa hasil dari perbandingan berikut: `5 > 3 && 2 < 1`?

   - a. true
   - b. false
   - c. error
   - d. null

**Jawaban : b. false**

9. Android Studio adalah tools untuk:

   - a. Menulis HTML
   - b. Menjalankan script Python
   - c. Membuat aplikasi Android
   - d. Desain presentasi

**Jawaban : c. Membuat aplikasi Android**

10. Untuk berpindah dari satu activity ke activity lain di Android, digunakan:

- a. Intent
- b. Fragment
- c. TextView
- d. XML

**Jawaban : a. Intent**

---

### ✅ **Bagian B – Jawaban Penjelasan Singkat (15 Soal)**

11. Jelaskan perbedaan `val` dan `var` di Kotlin.

**Jawaban:** Nilai dalam variabel var dapat diubah, sedangkan di val tidak dapat diubah.

12. Sebutkan dua tipe data numerik dalam Kotlin.

**Jawaban:** `Int` dan `Double`.

13. Apa kegunaan fungsi `println()`?

**Jawaban:** Digunakan untuk mencetak output.

14. Bagaimana cara mengambil input angka dari pengguna dan mengubahnya ke tipe `Int` secara aman?

**Jawaban:** Menggunakan `readLine()?.toIntOrNull()` untuk mengambil input dan mengubahnya ke tipe `Int` dengan aman sehingga menghindari error jika input tidak valid.

15. Sebutkan satu contoh layout yang sering digunakan dalam Android dan fungsinya.

**Jawaban:** `LinearLayout` yang digunakan untuk mengatur tampilan komponen secara vertikal atau horizontal.

16. Apa itu `Intent` dalam Android?

**Jawaban:** untuk melakukan perpindahan dari satu activity ke activity lain di Android.

17. Bagaimana cara menampilkan teks di layar Android menggunakan Kotlin dan XML?

**Jawaban:** Menggunakan `TextView` di XML.

18. Apa arti dari null safety dalam Kotlin?

**Jawaban:** Null safety untuk mencegah terjadinya NullPointerException.

19. Apa perbedaan antara `toInt()` dan `toIntOrNull()`?

**Jawaban:** `toInt()` akan menghasilkan error jika input tidak bisa diubah ke `Int`, sedangkan `toIntOrNull()` akan menghasilkan `null` jika input tidak valid, sehingga lebih aman digunakan.

20. Sebutkan minimal satu keunggulan Kotlin dibandingkan Java dalam pengembangan Android.

**Jawaban:** Kotlin memiliki sintaks yang lebih ringkas.

21. Dalam Android Studio, di folder mana biasanya file `activity_main.xml` disimpan?

**Jawaban:** Pada folder `res/layout`.

22. Bagaimana struktur dasar fungsi utama (`main`) dalam Kotlin? Tuliskan contohnya.

**Jawaban:** Struktur dasar fungsi (`main`) dalam Kotlin adalah:

```kotlin
fun main() {
    // kode program
}
```
23. Apa yang dimaksud dengan `String interpolation` dalam Kotlin?

**Jawaban:** Untuk menyisipkan nilai variabel ke dalam string dengan menggunakan tanda `$` atau `${}`.

24. Apa arti `?.` dan `?:` dalam penulisan kode Kotlin?

**Jawaban:** `?.` digunakan untuk mengakses properti atau metode dari objek yang mungkin `null` tanpa menyebabkan error, sedangkan `?:` memberikan nilai default jika ekspresi di sebelah kiri adalah `null`.

25. Bagaimana Kotlin menangani error saat input dari user tidak sesuai tipe data?

**Jawaban:** Kotlin menyediakan fungsi seperti `toIntOrNull()` untuk mengonversi input ke tipe data tertentu dengan aman, sehingga jika input tidak valid, akan mengembalikan `null` daripada menyebabkan error.

---

### ✅ **Bagian C – Perbaiki Kode (5 Soal)**

26. Perbaiki dan jelaskan:

```kotlin
fun main() {
    val umur = readLine()
    println("Umur anda adalah " + umur + 5)
}
```

**Kesalahan:** Kode ini akan menghasilkan error karena mencoba menambahkan `String` dengan `Int`. Perbaiki dengan mengonversi `umur` ke `Int`.

**Perbaikan:**
```kotlin
fun main() {
    val umur = readLine()?.toIntOrNull() ?: 0
    println("Umur anda adalah ${umur + 5}")
}
```

---

27. Perbaiki:

```kotlin
val nama: String
println("Halo $nama")
```

**Kesalahan:** Variabel `nama` belum diinisialisasi nilai awalnya sebelum digunakan.

**Perbaikan:**
```kotlin
fun main() {
    val nama: String = "John Doe"
    println("Halo $nama")
}
```

---

28. Perbaiki dan jalankan:

```kotlin
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: umur tahun")
}
```
**Kesalahan:** Variabel `umur` tidak digunakan dengan benar dalam string interpolasi.

**Perbaikan:**
```kotlin
fun main() {
    val nama = readLine()
    val umur = readLine()?.toIntOrNull() ?: 0
    println("Nama saya: $nama, umur: $umur tahun")
}
```

---

29. Perbaiki kode berikut agar tidak error:

```kotlin
val angka = "20"
val hasil = angka + 5
println(hasil)
```
**Kesalahan:** Kode ini mencoba menambahkan `String` dengan `Int`, yang akan menghasilkan `String` bukan penjumlahan numerik.

**Perbaikan:**
```kotlin
fun main() {
    val angka = "20"
    val hasil = angka.toInt() + 5
    println(hasil)
}
```

---

30. Debug:

```kotlin
fun main() {
  val tinggi = readLine().toDouble()
  println("Tinggi kamu adalah $tinggi")
}
```

**Kesalahan:** Jika input tidak valid, akan menyebabkan error saat mengonversi ke `Double`.

**Perbaikan:**
```kotlin
fun main() {
    val tinggi = readLine()?.toDoubleOrNull() ?: 0.0
    println("Tinggi kamu adalah $tinggi")
}
```

---
