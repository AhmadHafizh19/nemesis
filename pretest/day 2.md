## 📄 **Pretest: Activity Lifecycle di Android (30 Soal)**

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

**Pilih satu jawaban yang paling benar.**

1. Method lifecycle manakah yang pertama kali dipanggil ketika Activity baru dimulai?
   a. `onResume()`
   b. `onCreate()`
   c. `onStart()`
   d. `onRestart()`

**Jawaban: b. `onCreate()`**

2. Method `onPause()` biasanya dipanggil ketika...
   a. Aplikasi ditutup total
   b. User menekan tombol back
   c. Activity lain muncul di atas Activity saat ini
   d. Aplikasi di-_reinstall_

**Jawaban: c. Activity lain muncul di atas Activity saat ini**

3. Method `onDestroy()` akan selalu dipanggil jika...
   a. Aplikasi direstart
   b. Pengguna berpindah ke Activity lain
   c. Aplikasi ditutup melalui recent apps
   d. Tidak selalu dijamin dipanggil

**Jawaban: d. Tidak selalu dijamin dipanggil**

4. Saat rotasi layar terjadi, method apa yang umumnya **tidak** dipanggil kembali secara otomatis?
   a. `onCreate()`
   b. `onStart()`
   c. `onPause()`
   d. `onRestart()`

**Jawaban: d. `onRestart()`**

5. Lifecycle `onRestart()` akan dipanggil saat...
   a. Aplikasi dijalankan pertama kali
   b. Setelah `onStop()` dan Activity dibuka lagi
   c. Setelah `onDestroy()`
   d. Setelah `onPause()`

**Jawaban: b. Setelah `onStop()` dan Activity dibuka lagi**

6. Saat user menekan tombol home, urutan method yang dipanggil adalah:
   a. `onPause()`, `onDestroy()`
   b. `onPause()`, `onStop()`
   c. `onStop()`, `onDestroy()`
   d. `onCreate()`, `onStart()`

**Jawaban: b. `onPause()`, `onStop()`**

7. Untuk menyimpan data sementara sebelum Activity di-_recreate_, gunakan:
   a. `onStart()`
   b. `onPause()`
   c. `onSaveInstanceState()`
   d. `onResume()`

**Jawaban: c. `onSaveInstanceState()`**

8. Jika ingin mencegah Activity di-_recreate_ saat rotasi, properti apa yang ditambahkan?
   a. `android:stateAlwaysVisible`
   b. `android:keepScreenOn`
   c. `android:configChanges="orientation|screenSize"`
   d. `android:restartOnRotation`

**Jawaban: c. `android:configChanges="orientation|screenSize"`**

9. Lifecycle method mana yang dipanggil tepat setelah `onCreate()`?
   a. `onStop()`
   b. `onDestroy()`
   c. `onStart()`
   d. `onPause()`

**Jawaban: c. `onStart()`**

10. Fungsi dari `onResume()` adalah...
    a. Menyimpan data sebelum aplikasi ditutup
    b. Menjalankan logika utama setelah tampilan muncul
    c. Menghapus cache aplikasi
    d. Mendaftarkan listener ViewGroup

**Jawaban: b. Menjalankan logika utama setelah tampilan muncul**

---

### ❓ **Bagian B – True/False (10 Soal)**

**Tulis T (True) atau F (False) untuk setiap pernyataan.**

11. `onStart()` dipanggil hanya sekali selama siklus hidup Activity. **(False)**
12. `onPause()` dipanggil sebelum `onStop()`. **(True)**
13. `onDestroy()` selalu dipanggil jika Activity berpindah ke Activity lain. **(False)**
14. Rotasi layar akan memanggil kembali `onCreate()`. **(True)**
15. `onResume()` menandakan bahwa Activity sedang tampil dan aktif. **(True)**
16. `onSaveInstanceState()` digunakan untuk menampilkan notifikasi. **(False)**
17. Setelah `onStop()`, Activity akan langsung `onDestroy()` tanpa pengecualian. **(False)**
18. Method `onRestart()` tidak akan pernah dipanggil jika aplikasi ditutup total. **(True)**
19. `onCreate()` hanya digunakan untuk menampilkan layout. **(False)**
20. Android menjamin bahwa semua lifecycle dipanggil secara berurutan. **(False)**

---

### ✍️ **Bagian C – Isian Singkat (5 Soal)**

21. Sebutkan 3 method utama yang dipanggil ketika Activity pertama kali diluncurkan.

**Jawaban:** `onCreate()`, `onStart()`, `onResume()`

22. Apa fungsi utama dari method `onSaveInstanceState()`?

**Jawaban:** Untuk menyimpan data sementara sebelum Activity di-_recreate_, misal saat rotasi layar.

23. Apa perbedaan `onPause()` dan `onStop()` dalam siklus Activity?

**Jawaban:** `onPause()` dipanggil saat Activity masih sebagian terlihat, sedangkan `onStop()` dipanggil saat activity sudah tidak terlihat sama sekali di layar.

24. Apa dampak dari tidak menambahkan `configChanges` saat orientasi berubah?

**Jawaban:** Activity akan di-_recreate_ saat rotasi layar yang berarti `onCreate()` akan dipanggil kembali, dan semua data yang tidak disimpan akan hilang.

25. Sebutkan satu kondisi di mana `onDestroy()` **tidak** dipanggil oleh sistem Android.

**Jawaban:** Sistem menutup activity secara paksa.

---

### 🔧 **Bagian D – Koreksi Kode (5 Soal)**

**Perbaiki dan jelaskan kesalahan pada cuplikan kode berikut.**

26.

```kotlin
override fun onCreate() {
  super.onCreate()
  setContentView(R.layout.activity_main)
}
```
**Kesalahan:** Method `onCreate()` harus menerima parameter `savedInstanceState: Bundle?`.

**Perbaikan:**
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
}
```

27.

```kotlin
override fun onStop(savedInstanceState: Bundle?) {
  super.onStop(savedInstanceState)
  Log.d("LIFECYCLE", "Stopped")
}
```

**Kesalahan:** Method `onStop()` seharusnya tidak menerima parameter apapun.

**Perbaikan:**
```kotlin
override fun onStop() {
    super.onStop()
    Log.d("LIFECYCLE", "Stopped")
}
```

28.

```kotlin
override fun onResume() {
  setContentView(R.layout.activity_main)
  super.onResume()
}
```

**Kesalahan:** `setContentView()` seharusnya tidak dipanggil di `onResume()`, melainkan di `onCreate()`.

**Perbaikan:**
```kotlin
override fun onResume() {
    super.onResume()
}
```


29.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  Log.d("LIFECYCLE", "Created")
}
```

**Kesalahan:** `onCreate()` harus memanggil `super.onCreate(savedInstanceState)` untuk memastikan lifecycle berjalan dengan benar.

**Perbaikan:**
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.d("LIFECYCLE", "Created")
}
```

30.

```kotlin
override fun onSaveInstanceState() {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}
```

**Kesalahan:** `onSaveInstanceState()` harus menerima parameter `outState: Bundle`.

**Perbaikan:**
```kotlin
override fun onSaveInstanceState(outState: Bundle) {
  super.onSaveInstanceState(outState)
  outState.putString("username", "admin")
}
```

---
