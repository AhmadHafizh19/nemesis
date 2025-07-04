

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

## 📘 Daftar Soal dan Jawaban: Fragment di Android

1. **Fragment digunakan untuk:**
    - A. Menyimpan data permanen
    - B. Menampilkan halaman web
    - C. Membagi antarmuka aplikasi ke dalam bagian modular
    - D. Menyimpan file gambar

**Jawaban:** C. Membagi antarmuka aplikasi ke dalam bagian modular

2. **Kelas dasar untuk membuat fragment adalah:**
    - A. `AppCompatFragment`
    - B. `FragmentManager`
    - C. `Fragment`
    - D. `SupportFragment`

**Jawaban:** C. Fragment

3. **Metode untuk menambahkan fragment ke activity adalah:**
    - A. `addView()`
    - B. `beginTransaction().add()`
    - C. `inflate()`
    - D. `pushFragment()`

**Jawaban:** B. beginTransaction().add()

4. **Untuk mengelola fragment, kita menggunakan:**
    - A. `ActivityManager`
    - B. `FragmentAdapter`
    - C. `FragmentManager`
    - D. `Intent`

**Jawaban:** C. FragmentManager

5. **Layout container yang umum digunakan untuk menempatkan fragment di XML adalah:**
    - A. `TextView`
    - B. `LinearLayout`
    - C. `FrameLayout`
    - D. `ListView`

**Jawaban:** C. FrameLayout

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity. **(False)**
7. Satu activity bisa menampilkan lebih dari satu fragment. **(True)**
8. Kita tidak bisa mengganti fragment yang sedang ditampilkan. **(False)**
9. Fragment bisa mengakses komponen UI dari activity langsung. **(True)**
10. Fragment tidak bisa hidup tanpa activity. **(True)**

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android?

**Jawaban:** Mengelola fragment dalam activity.

12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment?

**Jawaban:** `onCreateView()`.

13. Sebutkan dua metode lifecycle penting pada fragment!

**Jawaban:** `onCreate()`, `onCreateView()`.

14. Bagaimana cara mengirim data dari activity ke fragment?

**Jawaban:** Menggunakan `Bundle` dan `setArguments(Bundle)` pada fragment.

15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?

**Jawaban:** Karena `FrameLayout` memungkinkan penempatan satu fragment di atas yang lain, ideal untuk fragment yang dinamis.

16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?

**Jawaban:** `replace()` mengganti fragment yang ada dengan yang baru, sedangkan `add()` menambahkan fragment baru tanpa menghapus yang lama, sehingga memungkinkan beberapa fragment ditampilkan bersamaan.

17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.

**Jawaban:** Tidak bisa, fragment selalu terkait dengan activity.

18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?

**Jawaban:** Menggunakan `addToBackStack()` saat melakukan transaksi fragment.

19. Apa tujuan dari `setArguments(Bundle)` di fragment?

**Jawaban:** Untuk mengirim data ke fragment sebelum fragment tersebut dibuat, sehingga data tersebut bisa diakses dalam lifecycle fragment.

20. Sebutkan alasan menggunakan fragment dibanding activity!

**Jawaban:** Fragment memungkinkan desain UI yang modular, reuse kode, dan manajemen UI yang lebih fleksibel dalam satu activity.

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction.add(R.id.container, fragment).commit()
```

**Kesalahan:** `add` harus dipanggil sebagai metode, bukan properti.

**Perbaikan:**

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
```
---

22.

```kotlin
class MyFragment : Fragment {
    override fun onCreateView(...) { ... }
}
```

**Kesalahan:** Harus menggunakan tanda kurung setelah `Fragment`.

**Perbaikan:**

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(...) { ... }
}
```
---

23.

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />
```

**Kesalahan:** Typo pada `layout_heigth`.

**Perbaikan:**

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments(bundle)
```

**Kesalahan:** `arguments` harus dipanggil sebagai properti, bukan metode.

**Perbaikan:**

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments = bundle
```
---

25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()
```

**Kesalahan:** `addToBackStack()` harus dipanggil dengan nama stack.
**Perbaikan:**

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack("NewFragment")
    .commit()
```

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```

**Kesalahan:** `onCreateView` harus mengembalikan `View?` bukan `View`.
**Perbaikan:**

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```
---

27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle(args)
```

**Kesalahan:** `setBundle` bukan metode yang valid untuk fragment. karena fragment menggunakan `arguments` untuk menerima data.

**Perbaikan:**

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.arguments = args
```
---

28.

```kotlin
supportFragmentManager.pop()
```

**Kesalahan:** `pop()` bukan metode yang valid pada `FragmentManager`. Harus menggunakan `popBackStack()`.

**Perbaikan:**

```kotlin
supportFragmentManager.popBackStack()
```
---

29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()
```

**Kesalahan:** `commitNowAllowingStateLoss()` tidak perlu digunakan di sini, karena ini akan mengabaikan state loss yang tidak diinginkan.

**Perbaikan:**

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commit()
```
---

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)
```

**Kesalahan:** `inflate` harus menerima tiga parameter: layout, container, dan attachToRoot.

**Perbaikan:**

```kotlin
val view = inflater.inflate(R.layout.fragment_home, container, false)
```


---
