

#### 1. Library paling umum digunakan untuk HTTP Client di Android Kotlin modern:

a. OkHttp
b. Volley
c. Retrofit
d. Alamofire

Jawaban: c. Retrofit

---

#### 2. Fungsi dari `@GET("users")` dalam Retrofit:

a. Menyimpan data pengguna
b. Mengirim form ke server
c. Mengirim permintaan HTTP GET ke endpoint `users`
d. Menghapus pengguna dari server

Jawaban: c. Mengirim permintaan HTTP GET ke endpoint `users`

---

#### 3. Mengapa kita menggunakan Coroutine atau `Call.enqueue()` saat Retrofit dipakai?

a. Untuk mempermudah syntax Kotlin
b. Untuk menjaga agar UI tidak macet saat HTTP call
c. Agar data disimpan ke SharedPreferences
d. Agar aplikasi bisa offline

Jawaban: b. Untuk menjaga agar UI tidak macet saat HTTP call

---

#### 4. Untuk mengkonversi JSON ke objek Kotlin, kita menggunakan:

a. JsonParser
b. GsonConverterFactory
c. JSONTokener
d. JSONBuilder

Jawaban: b. GsonConverterFactory

---

#### 5. Fungsi utama `baseUrl` di Retrofit:

a. Mengatur authentication
b. Menentukan response type
c. Menentukan endpoint utama API
d. Menentukan ukuran file

Jawaban: c. Menentukan endpoint utama API

---

#### 6. Kapan kita perlu menambahkan `@Query` di Retrofit?

a. Saat upload file
b. Saat mengirim body JSON
c. Saat menambahkan parameter URL
d. Saat menyimpan token

Jawaban: c. Saat menambahkan parameter URL

---

#### 7. `Response.body()` akan bernilai `null` jika:

a. API berhasil dipanggil
b. Status HTTP adalah 200
c. Response tidak sesuai format
d. Retrofit tidak digunakan

Jawaban: c. Response tidak sesuai format

---

#### 8. Untuk membuat POST request dengan Retrofit, anotasi yang digunakan adalah:

a. @GET
b. @POST
c. @PUT
d. @FETCH

Jawaban: b. @POST

---

#### 9. Apa yang terjadi jika kita lupa menambahkan `.create()` pada GsonConverterFactory?

a. Program tetap jalan
b. Data akan disimpan sebagai string
c. Retrofit akan error saat parsing
d. File JSON akan corrupt

Jawaban: c. Retrofit akan error saat parsing

---

#### 10. Manakah dari berikut ini yang merupakan cara **asynchronous** memanggil API dengan Retrofit?

a. `.execute()`
b. `.enqueue()`
c. `.get()`
d. `.await()`

Jawaban: b. `.enqueue()`

---


#### 11. Jelaskan perbedaan antara Retrofit dan OkHttp dalam arsitektur Android.
Jawaban: Retrofit yang berfokus pada mempermudah interaksi dengan REST API, sementara OkHttp yang menangani permintaan HTTP (network layer).

---

#### 12. Sebutkan dua cara menangani response API di Retrofit!
Jawaban: `Call.enqueue()` untuk asynchronous dan `Call.execute()` untuk synchronous.

---

#### 13. Bagaimana cara mengecek apakah response dari server berhasil atau tidak?
Jawaban: Dengan memeriksa `response.isSuccessful` atau status code seperti 200.

---

#### 14. Apa fungsi `@Header("Authorization")` dalam Retrofit?
Jawaban: Untuk mengirim header khusus, seperti token otentikasi, dalam permintaan HTTP.

---

#### 15. Apa itu suspend function dan mengapa sering digunakan bersama Retrofit?
Jawaban: Suspend function adalah fungsi yang dapat ditangguhkan dan dilanjutkan, sering digunakan dengan Retrofit untuk memanggil API secara asynchronous dalam coroutine, sehingga tidak memblokir thread utama.

---

#### 16. Sebutkan satu contoh kasus nyata di mana HTTP client dibutuhkan dalam aplikasi Android.
Jawaban: Mengambil data pengguna dari server untuk ditampilkan di aplikasi, seperti daftar produk atau profil pengguna.

---

#### 17. Jika API kamu lambat dan pengguna harus menunggu lama, bagaimana solusi teknisnya?
Jawaban: Menggunakan caching untuk menyimpan response sebelumnya, menampilkan loading indicator, atau menggunakan pagination untuk memuat data secara bertahap.

---

#### 18. Bagaimana cara menangani `TimeoutException` saat HTTP call?
Jawaban: Dengan menangkap exception tersebut dalam blok `try-catch` dan memberikan feedback kepada pengguna.

---

#### 19. Mengapa penting untuk menangani error code seperti 401 atau 500?
Jawaban: Error code seperti `401` (Unauthorized) dan `500` (Server Error) menunjukkan masalah autentikasi atau server, sehingga aplikasi bisa memberikan respons yang tepat.

---

#### 20. Apa itu DTO dalam konteks komunikasi dengan API?
Jawaban: DTO (Data Transfer Object) adalah objek yang digunakan untuk mengirim data antara aplikasi dan API.

---

### 🛠️ ** FIX CODE **

#### 21. Perbaiki kode Retrofit interface ini agar valid:

```kotlin
interface ApiService {
    @GET
    fun getUser(): Call<User>
}
```

Kesalahan: Anotasi `@GET` harus memiliki endpoint yang dituju.

Perbaikan:
```kotlin
interface ApiService {
    @GET("user")
    fun getUser(): Call<User>
}
```

---
#### 22. Ada kesalahan dalam Retrofit builder berikut. Apa yang salah?

```kotlin
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com")
    .addConverterFactory(GsonConverterFactory)
    .build()
```

Kesalahan: `GsonConverterFactory` harus dipanggil sebagai fungsi.

Perbaikan:
```kotlin
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
```

---

#### 23. Diberikan JSON seperti ini:

```json
{
  "status": "ok",
  "data": {
    "id": 10,
    "name": "Anna"
  }
}
```

Perbaiki model Kotlin-nya:

```kotlin
data class User(
    val id: Int,
    val fullName: String
)
```

Kesalahan: Nama properti `fullName` tidak sesuai dengan JSON.

Perbaikan:
```kotlin
data class User(
    val id: Int,
    val name: String
)
```

---

#### 24. Lengkapi kode Retrofit untuk mengirim data JSON:

```kotlin
@POST("user/add")
fun createUser(@Body user: ???): Call<User>
```

Kesalahan: Parameter `user` harus memiliki tipe yang sesuai.

Perbaikan:
```kotlin
@POST("user/add")
fun createUser(@Body user: User): Call<User>
```

---

#### 25. Perbaiki fungsi berikut agar memanggil API secara asynchronous:

```kotlin
val call = apiService.getUser()
val result = call.execute()
```

Kesalahan: `execute()` adalah synchronous call yang akan memblokir thread utama.

Perbaikan:
```kotlin
val call = apiService.getUser()
call.enqueue(object : Callback<User> {
    override fun onResponse(call: Call<User>, response: Response<User>) {
        // handle success
    }

    override fun onFailure(call: Call<User>, t: Throwable) {
        // handle error
    }
})
```
---

#### 26. Perbaiki parameter Retrofit berikut agar bisa mengirim `id` lewat query:

```kotlin
@GET("user")
fun getUser(@Param("id") id: Int): Call<User>
```

Kesalahan: Anotasi yang benar untuk parameter query adalah `@Query`, bukan `@Param`.

Perbaikan:
```kotlin
@GET("user")
fun getUser(@Query("id") id: Int): Call<User>
```

---

#### 27. Perbaiki kode berikut agar response-nya bisa langsung digunakan di ViewModel coroutine:

```kotlin
@GET("user")
fun getUser(): Call<User>
```

Kesalahan: Fungsi harus dideklarasikan sebagai `suspend` agar bisa digunakan dalam coroutine.

Perbaikan:
```kotlin
@GET("user")
suspend fun getUser(): User
```

---

#### 28. Lengkapi kode penggunaan Retrofit di Android ViewModel:

```kotlin
val user = api.getUser()
user.enqueue(object: ??? {
    override fun onResponse(...) {
        // handle
    }
})
```

Kesalahan: Callback harus didefinisikan dengan benar.

Perbaikan:
```kotlin
val userCall = api.getUser()
userCall.enqueue(object : Callback<User> {
    override fun onResponse(...) {
        // handle
    }
})
```

---

#### 29. Lengkapi `DataRepository` berikut agar bisa meng-handle error response:

```kotlin
val call = api.getUser()
call.enqueue(object: Callback<User> {
    override fun onFailure(call: Call<User>, t: Throwable) { }
    override fun onResponse(call: Call<User>, response: Response<User>) {
        // handle success
    }
})
```

Kesalahan: Tidak ada penanganan untuk error response.

Perbaikan:
```kotlin
val call = api.getUser()
call.enqueue(object : Callback<User> {
    override fun onFailure(call: Call<User>, t: Throwable) {}
    override fun onResponse(call: Call<User>, response: Response<User>) {
        // handle success
    }
})
```

---

#### 30. Perbaiki kode pemanggilan API ini agar menggunakan `suspend` function dan `try-catch`:

```kotlin
val result = api.getUser()
val data = result.body()
```

Kesalahan: Tidak menangani kemungkinan exception dan harus menggunakan `suspend` function.

Perbaikan:
```kotlin
suspend fun fetchUser() {
    try {
        val result = api.getUser()
        if (result.isSuccessful) {
            val data = result.body()
            // handle data
        } else {
            // handle error response
        }
    } catch (e: Exception) {
        // handle exception
    }
}
```

---