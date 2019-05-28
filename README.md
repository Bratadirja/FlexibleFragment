# Flexible Fragment
Fragment adalah sebuah reuseable class yang mengimplementasikan beberapa fitur sebuah Activity dan sebuah Fragment tidak dapat berdiri sendiri tanpa sebuah Activity. Mengembangkan aplikasi dengan Fragment memiliki fleksibilitas karena kita dapat memanipulasi fragment - fragment tersebut seperti menambah atau membuangnya untuk bisa digunakan kembali pada kebutuhan yang memiliki kemiripan fungsi dalam satu flow aplikasi. Tutorial ini akan membahas bagaimana cara menggunakan banyak Fragment dengan hanya menggunakan satu Activity atau biasa disebut dengan Flexibilitas Fragment.

# Membuat Aplikasi Android dengan menggunakan Flexible Fragment
1.  Buat Project baru <br><br>
![1](https://user-images.githubusercontent.com/35905214/58455827-d4d90200-814c-11e9-9a16-dac6df51b6af.PNG)<hr>
2.  Untuk pengisian seperti Aplication Name, Company Domainm, dan Project Location dengan nama yang kamu suka, setelah itu klik   next hingga finish. tunggu sampai proses generate gradle selesai. <br><hr>
3.  Buat 3 buah fragment (.java) + layoutFragment (.xml) nya juga.<br>
    3.1 Code fragment_first.xml <br>
        ![2](https://user-images.githubusercontent.com/35905214/58457254-6a29c580-8150-11e9-8fd5-53287cbded39.PNG)
        ![3](https://user-images.githubusercontent.com/35905214/58457422-d9071e80-8150-11e9-8c83-89e602b0d07a.PNG)<br><br>
        Code FirstFragment.java <br>
        ![4](https://user-images.githubusercontent.com/35905214/58457793-be817500-8151-11e9-83fe-51297fc60271.PNG)
        ![5](https://user-images.githubusercontent.com/35905214/58457798-c2ad9280-8151-11e9-8f0a-5829971c447b.PNG)<br><br>
    3.2 Code fragment_second.xml <br>
        ![6](https://user-images.githubusercontent.com/35905214/58458141-9d6d5400-8152-11e9-916d-8831b0c96a4e.PNG)
        ![7](https://user-images.githubusercontent.com/35905214/58458144-a100db00-8152-11e9-84f6-6c4e42b236f3.PNG)<br><br>
        Code FragmentSecond.java <br>
        ![8](https://user-images.githubusercontent.com/35905214/58458353-3603d400-8153-11e9-9437-1045b96c4680.PNG)
        ![9](https://user-images.githubusercontent.com/35905214/58458355-38662e00-8153-11e9-8904-cbc169053d95.PNG)
        ![10](https://user-images.githubusercontent.com/35905214/58458358-3ac88800-8153-11e9-85d0-1a76baa82dc7.PNG)<br><br>
    3.3 Code fragment_third.xml <br>
        ![11](https://user-images.githubusercontent.com/35905214/58458566-bfb3a180-8153-11e9-88f3-111424a4382a.PNG)
        ![12](https://user-images.githubusercontent.com/35905214/58458569-c0e4ce80-8153-11e9-92da-6cbcf10c70e0.PNG)<br><br>
        Code ThirdFragment.java <br>
        ![13](https://user-images.githubusercontent.com/35905214/58458770-30f35480-8154-11e9-86bd-3cba45fe480e.PNG)
        ![14](https://user-images.githubusercontent.com/35905214/58458771-318beb00-8154-11e9-95c2-23f3340f1818.PNG)<hr>
 4. Setelah membuat Ketiga Fragment tersebut masukan code dibawah ini kedalam activity_main.xml dan MainActivity.java untuk menampilkan Fragment-Fragment yang tadi telah di buat di Activity. <br>
     4.1 Code activity_main.xml <br>
         ![15](https://user-images.githubusercontent.com/35905214/58459215-11a8f700-8155-11e9-9f38-d8fed719fc69.PNG)
         ![18](https://user-images.githubusercontent.com/35905214/58459466-a3186900-8155-11e9-8fb2-7796b963e644.PNG)<br><br>
         Code MainActivity.java <br>
         ![16](https://user-images.githubusercontent.com/35905214/58459356-66e50880-8155-11e9-8203-23089212b139.PNG)
         ![17](https://user-images.githubusercontent.com/35905214/58459357-68163580-8155-11e9-9826-2739b50ccc41.PNG)<hr>
5. Setelah itu run program dengan menggunakan emulator atau bisa juga lewat device HP atau bisa juga dengan menginstal APK aplikasi yang terdapat dalam folder project.<hr>
# Penjelasan Code
1. Terdapat method "onCreateView()" didalam FirstFargment,SecondFragment,dan ThirdFragment itu karena sistem akan memanggilnya pada saat frament mengambar antarmuka penggunanya untuk pertama kalinya. Fragment memiliki [metode daur hidup](https://developer.android.com/guide/components/fragments?hl=id) seperti onCreate,onCreateView, dll. <br>
2. Code "((MainActivity)getActivity()).getSupportActionBar()" ini berfungsi untuk mengakses ActionBar. <br>
3. Terdapat code "((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true)" method  onOptionsItemSelected() : Event ketika back button diklik maka akan menjalankan perintah getFragmentManager().popBackStack(); yang akan membuat fragment saat ini dikeluarkan dari stack.
4. Pada btnFirstFragment kita memberika setOnClickListener agar ketika mengklik button yang terdapat pada fragment layout dapat melakukan prosen pergantian antar fragment dengan menggunakan method replace() yang telah ada.
5. Proses penambahan fragment dengan menggunakan method add() agar FirstFragment dapat tampil ke layar dengan sebelumnya kita melakukan pengecekan terhadap isi dari object savedInstanceState(). <hr>
# Output Aplikasi
untuk melihat tampilan klik gambar dibawah ini..<br>
[![3](https://user-images.githubusercontent.com/35905214/58464392-ccd68d80-815f-11e9-8b53-9a3ca9dbd914.PNG)
](https://youtu.be/1j1Qg4TKwXk)


