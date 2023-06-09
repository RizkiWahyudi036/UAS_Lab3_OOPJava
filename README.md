# UAS_Lab3_OOPJava

## - Harry Sion Tarigan 211401021
## - Rizki Wahyudi 211401036
## - Elisa Lolita Haganta Bangun 211401052

### NO 1
a. Inheritance (Pewarisan):
Inheritance adalah mekanisme dalam pemrograman berorientasi objek di mana sebuah kelas baru dapat memperoleh properti dan metode dari kelas yang sudah ada. Konsep ini memungkinkan pembuatan hierarki kelas, di mana kelas induk (superclass) mewariskan sifat-sifatnya kepada kelas anak (subclass). Kelas anak dapat menggunakan properti dan metode yang sudah ada, serta menambahkan properti dan metode baru sesuai kebutuhannya.

Contoh: Jika kita memiliki kelas "Kendaraan" sebagai kelas induk, kita dapat membuat kelas-kelas anak seperti "Mobil" dan "SepedaMotor" yang mewarisi properti dan metode dari kelas "Kendaraan". Misalnya, kelas "Mobil" dan "SepedaMotor" akan memiliki properti seperti "kecepatan" dan metode seperti "maju" yang diwarisi dari kelas "Kendaraan".

b. Polymorphism (Polimorfisme):
Polimorfisme adalah kemampuan objek untuk mengambil bentuk yang berbeda dan menampilkan perilaku yang berbeda melalui antarmuka yang sama. Dalam konteks pemrograman berorientasi objek, polimorfisme memungkinkan penggunaan metode yang sama dengan cara yang berbeda pada objek yang berbeda. Polimorfisme dapat dicapai melalui konsep overriding (penggantian metode) dan overload (pemilihan metode).

Contoh: Jika kita memiliki kelas "Hewan" dengan metode "suara()", kita dapat membuat kelas anak seperti "Anjing" dan "Kucing" yang mengimplementasikan metode "suara()" dengan perilaku yang berbeda. Misalnya, metode "suara()" pada kelas "Anjing" akan mengeluarkan suara "Guk guk!", sementara metode "suara()" pada kelas "Kucing" akan mengeluarkan suara "Meong!".

c. Kelas Interface:
Kelas Interface adalah kontrak yang mendefinisikan metode-metode yang harus ada dalam kelas-kelas yang mengimplementasikannya. Interface hanya berisi deklarasi metode tanpa implementasi konkret. Kelas yang mengimplementasikan interface harus mengimplementasikan semua metode yang ada di interface tersebut.

Contoh: Jika kita memiliki interface "Makanan" dengan metode "makan()", kita dapat membuat kelas-kelas seperti "Ayam", "Ikan", dan "Sayuran" yang mengimplementasikan interface "Makanan" dengan mengimplementasikan metode "makan()". Setiap kelas harus memberikan implementasi metode "makan()" sesuai dengan perilaku makan dari masing-masing jenis makanan.

d. Eksepsi dan Thread:
Eksepsi (Exceptions) adalah situasi abnormal atau error yang terjadi saat program berjalan. Saat eksepsi terjadi, aliran program normal terganggu dan kontrol dapat dialihkan ke bagian lain dalam kode yang menangani eksepsi tersebut. Eksepsi dapat terjadi karena berbagai alasan, seperti kesalahan pengguna, kesalahan sistem, atau kondisi yang tidak terduga.

Thread adalah unit pemrosesan terkecil yang dapat dieksekusi oleh sistem operasi. Thread memungkinkan program untuk menjalankan beberapa
