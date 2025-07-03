

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**


1. Komponen Android yang digunakan untuk menampilkan teks adalah:
   A. Button
   B. EditText
   C. TextView
   D. ImageView
   
**Jawaban: C. TextView**

2. Komponen UI yang digunakan untuk mengambil input teks dari pengguna adalah:
   A. Button
   B. TextView
   C. EditText
   D. Spinner

**Jawaban: C. EditText**

3. Untuk menampilkan gambar, kita menggunakan komponen:
   A. WebView
   B. ImageView
   C. RecyclerView
   D. VideoView

**Jawaban: B. ImageView**

4. Layout yang memungkinkan penempatan elemen secara bebas dengan constraint disebut:
   A. LinearLayout
   B. RelativeLayout
   C. ConstraintLayout
   D. FrameLayout

**Jawaban: C. ConstraintLayout**

5. Manakah yang merupakan komponen UI untuk menampilkan daftar data besar secara efisien?
   A. ListView
   B. GridView
   C. RecyclerView
   D. TextView

**Jawaban: C. RecyclerView**

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. `LinearLayout` hanya bisa digunakan untuk tata letak horizontal. **(False)**
7. `Button` bisa digunakan untuk menampilkan gambar. **(True)**
8. `ScrollView` hanya dapat memiliki satu child langsung. **(True)**
9. `Toast` digunakan untuk menampilkan notifikasi yang butuh interaksi pengguna. **(False)**
10. `findViewById()` digunakan untuk mengambil referensi UI dari layout XML. **(True)**

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa nama layout yang cocok untuk membuat UI kompleks dengan aturan posisi antar elemen?

**Jawaban:** `ConstraintLayout`

12. Sebutkan dua komponen UI untuk input pilihan pengguna!

**Jawaban:** `Spinner` dan `CheckBox`

13. Fungsi dari `TextInputLayout` adalah untuk...?

**Jawaban:** Menyediakan UI yang lebih baik untuk `EditText`, termasuk fitur seperti hint, error message, dan floating label.

14. Bagaimana cara menambahkan teks ke `TextView` di Kotlin?

**Jawaban:** `textView.text = "Teks Baru"`.

15. Apa fungsi `RecyclerView.Adapter` dalam RecyclerView?

**Jawaban:** Menghubungkan data dengan `ViewHolder` dan mengatur tampilan setiap item dalam `RecyclerView`.

16. Apa perbedaan utama antara `TextView` dan `EditText`?

**Jawaban:** `TextView` digunakan untuk menampilkan teks yang tidak dapat diedit, sedangkan `EditText` digunakan untuk mengambil input teks dari pengguna.

17. Komponen apa yang digunakan untuk membuat notifikasi pop-up singkat di layar?

**Jawaban:** `Toast`

18. Sebutkan satu perbedaan antara `LinearLayout` dan `RelativeLayout`!

**Jawaban:** `LinearLayout` mengatur elemen secara berurutan (horizontal/vertikal), `RelativeLayout` mengatur posisi relatif terhadap elemen lain.

19. Apa nama komponen UI untuk menampilkan teks dengan opsi "hint"?

**Jawaban:** `EditText`

20. Jika ingin menambahkan ikon di atas tombol, komponen apa yang sebaiknya digunakan?

**Jawaban:** `ImageButton`

---

## 🛠️ **Bagian 4: Perbaiki Kode (10 Soal)**

21.

```xml
<TextView
    android:layout_width="match_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```

**Kesalahan:** `match_content` harusnya `wrap_content`.

**Perbaikan:**

```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```

---
22.

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text("Click Me")
```
**Kesalahan:** `text` harus di-set menggunakan property assignment.

**Perbaikan:**

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text = "Click Me"
```

---
23.

```xml
<LinearLayout
    android:orientation="vertikal"
        ...>
```

**Kesalahan:** `vertikal` harusnya `vertical`.

**Perbaikan:**

```xml
<LinearLayout
    android:orientation="vertical"
    ...>
```

---
24.

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.setText = "Hi"
```

**Kesalahan:** `setText` merupakan fungsi, bukan property.

**Perbaikan:**

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.text = "Hi"
```

---
25.

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="image.png" />
```

**Kesalahan:** `src` harus menggunakan `@drawable/` untuk referensi gambar.

**Perbaikan:**

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="@drawable/image" />
```

---
26.

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.getText().toString
```

**Kesalahan:** `toString` tidak dipanggil sebagai fungsi.

**Perbaikan:**

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.getText().toString()
```

---
27.

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething()" />
```

**Kesalahan:** metode dalam `onClick` tidak perlu tanda kurung.

**Perbaikan:**

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething" />
```

---
28.

```kotlin
Toast.makeText(this, "Saved!", LENGTH_LONG).show()
```

**Kesalahan:** `LENGTH_LONG` harus diakses dari kelas `Toast`.

**Perbaikan:**

```kotlin
Toast.makeText(this, "Saved!", Toast.LENGTH_LONG).show()
```

---
29.

```xml
<EditText
    android:hintText="Enter name"
    ... />
```

**Kesalahan:** attribut `hintText` tidak ada dalam XML Android, harusnya `hint`.

**Perbaikan:**

```xml
<EditText
    android:hint="Enter name"
    ... />
```

30.

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContent(layout)
```

**Kesalahan:** fungsi `setContent` tidak ada di Android Activity, harusnya `setContentView`.

**Perbaikan:**

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContentView(layout)

---
