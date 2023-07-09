package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Model.ArticleSharedData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class ArticlePage implements Initializable {
    ArrayList<ArticleSharedData> article = new ArrayList<ArticleSharedData>();
    ArticleSharedData article1 = new ArticleSharedData("Sungai Citarum, Predikat Sungai Tercemar di Dunia. Bagaimana Solusinya?",
     "Photo/Ar1_Photo.jpg", 
     "Sungai Citarum yang berlokasi di Jawa Barat dan berada di DAS Citarum telah menyandang predikat sebagai salah satu wilayah yang tercemar di dunia. Sungai sepanjang 269 kilometer ini mempunyai tiga masalah utama. Pada bagian hulu DAS, terdapat lahan kritis yang kerap kali memberikan masukan erosi tanah, selanjutnya mengalir pada sepanjang aliran dan mengendap. Sedimentasi yang menumpuk tersebut menyebabkan potensi bencana banjir ketika musim penghujan datang. Pada tahun 2013, Green Cross Swizerland dan Blacksmith Institute telah membenarkan bahwa Sungai Citarum menjadi salah satu tempat tercemar dan terkotor di dunia. Aliran air di sepanjang sungai mengalami penurunan kualitas karena banyaknya erosi serta ditambah pencemaran kotoran ternak, sampah rumah tangga dan limbah pabrik. Berbagai senyawa beracun pun ikut muncul di DAS Citarum yang tentunya berdampak buruk pada wilayah serta 35 juta orang di 13 Kabupaten/kota yang dilaluinya. Penelitian yang dilakukan oleh Greenpeace Asia Tenggara dan Wahana Lingkungan Hidup Indonesia (WALHI) Jawa Barat telah menemukan hasil bahwa logam berat yang berasal dari limbah pabrik telah menjadi kontaminan utama Sungai Citarum.\r\n" + //
             "\r\n" + //
             "Pesatnya pertumbuhan penduduk dan pembangunan yang terus berjalan mengakibatkan DAS Citarum makin terdegradasi. Beberapa aktivitas seperti pembukaan lahan hutan untuk pembangunan perumahan dan pengusahaan lahan pertanian, perilaku membuang sampah ke sungai yang tidak terkontrol juga menjadi satu indikasi sebab kerusakan. Telah diakui bahwa masyarakat sepanjang aliran sungai memiliki budaya membuang sampah yang tidak dilakukan pengolahan terlebih dahulu. Masih minimnya pemahaman akan lingkungan dan sikap apatis masyarakat terhadap kondisi sungai dan sampah semakin memperburuk kondisi Sungai Citarum. Telah terdapat beberapa implementasi program yang sangat baik dan berbobot dari Pemprov Jawa Barat seperti \u201CCitarum Bergetar (2000-2003)\u201D dengan fokus program yakni pengendalian pencemaran, selanjutnya \u201CCitarum Bestari (2013)\u201D dengan dokus program yakni pengentasan masalah pencemaran air serta mewujudkan air Sungai Citarum Layak Minum dalam lima tahun. Pada kenyataannya, kedua program tersebut gagal dipenuhi dan tidak dapat diimplementasikan dengan sempurna. Selanjutnya, terdapat satu program terbaru yang baru rilis pada tahun 2018 dan didorong langsung oleh Presiden Joko Widodo yakni \u201CCitarum Harum\u201D. Pada intinya keseluruhan program tersebut dilakukan dengan tujuan memulihkan dan mengembalikan ekosistem DAS Citarum agar kondisinya dapat menjadi baik, namun sering kali program yang digencarkan mengalami kendala dalam pelaksanaan.\r\n" + //
             "\r\n" + //
             "Persoalan tentang mengembalikan kondisi Sungai Citarum agar dapat kembali sebagaimana kondisi awal tidak semudah membalikan telapak tangan. Beberapa titik DAS Citarum yang melewati 13 Kabupaten/Kota masih dikelola oleh segelintir pihak seperti Perhutani dan Perkebunan Nusantara VII. Sungai Citarum memang melintasi belasan kabupaten/kota sehingga urusan-urusan sampah kerap kali menjadi bola ping pong. Seringkali program yang digencarkan juga mengalami kendala seperti kendala koordinasi, belum sepenuhnya semua stakeholder dilibatkan dalam merumuskan solusi, serta belum semua mengerti akan makna tanggung jawab bersama dalam mengelola Sungai Citarum. Beberapa pihak berkepentingan memang seharusnya didudukan bersama untuk merumuskan solusi menyeluruh atas problematika Sungai Citarum yang tidak kunjung selesai sejak lama, sehingga harapannya tidak akan lagi ditemui tentang persoalan pekerjaan-pekerjaan yang tidak sinkron.\r\n" + //
             "\r\n" + //
             "Pemerintah dan berbagai pihak terkait harus terus berupaya untuk memberikan pengetahuan yang benar kepada masyarakat, terutama mengenai kelestarian lingkungan hidup. Seringkali terjadi, perilaku masyarakat yang menyimpang, dalam artian tidak memperdulikan alam sekitar bukan atas dasar kesengajaan, akan tetapi disebabkan oleh minimnya pengetahuan akan kelestarian alam. Berbagai level stakeholder harus bersama-sama terjun Menyusun dan merancang kegiatan edukasi yang dapat mencerdaskan masyarakat. Paling tidak, masyarakat mengerti dan memahami dasar-dasar penjagaan terhadap kelestarian alam, mulai dari hal-hal yang kecil seperti membuangsampah pada tempatnya. Kebijakan yang dirumuskan tentunya harus bermanfaat bagi semua pihak, khususnya masyarakat yang terkena dampak langsung dari kebijakan tersebut.\r\n" + //
             "\r\n" + //
             "Stakeholder terkait penanganan masalah DAS Citarum antara lain Bappenas yang berperan menyusun Roadmap Citarum terkait dengan Integrated Citarum Water Resources Management Invesment Program (ICWRMIP). Penyusunan RoadMap dilakukan oleh satu Tim yang dibentuk oleh Bappenas, dengan melibatkan berbagai pihak baik dari unsur pemerintah pusat, provinsi, kabupaten, pihak swasta, BUMN/BUMD maupun unsur non pemerintah (CSO/NGO). Di tingkat provinsi, Bappeda Provinsi Jawa Barat memegang peranan penting untuk mengawal kebijakan pusat dalam pengelolaan Citarum dalam aspek perencanaan dan koordinasi. Pengelolaan SDA ditangani oleh Bidang Fisik, Dirjen SDA dan BBWS Citarum. BBWS Citarum bertugas untuk melaksanakan pengelolaan sumber daya air yang meliputi: perencanaan, pelaksanaan konstruksi, operasi dan pemeliharaan dalam rangka konservasi sumber daya air, pendayagunaan sumber daya air dan pengendalian daya rusak air pada wilayah sungai Citarum. Balai Pendayagunaan Sumber Daya Air (BPSDA) Citarum menjadi salah satu Unit Pelaksana Teknis (UPT) di bawah Dinas PSDA Provinsi Jawa Barat yang secara spesifik mempunyai tugas melaksanakan sebagian fungs\u00ED Dinas di bidang pendayagunaan sumber daya air di wilayah sungai Citarum.");
    
    ArticleSharedData article2 = new ArticleSharedData("Waspada Pencemaran Sungai, Kenali Penyebab dan Akibatnya !", 
    "Photo/Ar2_Photo.jpg",
    "Pencemaran sungai merupakan salah satu bentuk dari pencemaran air yang membuat sungai menjadi terkontaminasi dan kehilangan fungsinya. Pencemaran bisa terjadi karena kurangnya rasa tanggung jawab dari manusia dengan membuang berbagai bentuk limbah ke dalam sungai dan mengakibatkan kondisi sungai terus mengalami penurunan. Sungai yang tercemar bisa memberikan dampak yang buruk bagi lingkungan, salah satunya adalah bisa terjadi banjir. Supaya Anda bisa lebih waspada mengenai pencemaran sungai, berikut ini adalah penjelasan lengkapnya.\r\n" + //
            "\r\n" + //
            "1. Apa itu Pencemaran Sungai?\r\n" + //
            "2. Penyebab Pencemaran Sungai\r\n" + //
            "\ta. Penggunaan Pupuk dalam Jumlah Besar\r\n" + //
            "\tb. Limbah Industri\r\n" + //
            "\tc. Limbah Rumah Tangga\r\n" + //
            "\td. Tumpahan Bahan Bakar\r\n" + //
            "\te. Limbah Air Panas\r\n" + //
            "3. Dampak Buruk Akibat Pencemaran Sungai\r\n" + //
            "\ta. Mempengaruhi Flora dan Fauna\r\n" + //
            "\tb. Kehilangan Nyawa Manusia\r\n" + //
            "\tc. Rusaknya Sistem Agrikultur\r\n" + //
            "4. Ciri-Ciri Sungai yang Tercemar\r\n" + //
            "5. Cara Menjaga Sungai Tetap Bersih.\r\n" + //
            "\r\n" + //
            "1. Apa itu Pencemaran Sungai?\r\n" + //
            "\tAir merupakan sumber daya alam yang penting bagi makhluk hidup. Tanpa adanya air yang bersih, makhluk hidup tidak dapat hidup secara normal. Jumlah air yang ada di muka bumi tidak mengalami perubahan, akan tetapi air tersebut mengalami perputaran yang bisa disebut juga sebagai sebuah siklus air.\r\n" + //
            "\r\n" + //
            "\tMengutip dari situs NASA Climate Kids, siklus air merupakan sebuah proses dimana air yang terdapat pada sungai, laut, danau, dan lainnya akan mengalami sebuah proses penguapan dan berubah menjadi uap air. Uap air akan mengalami proses kondensasi yang mengakibatkan air akan jatuh kembali ke tanah dalam bentuk hujan.\r\n" + //
            "\r\n" + //
            "\tDi dalam siklus air, sungai memiliki peran untuk mengaliri air dari arah hulu menuju hilir yang terletak pada laut. Kondisi dari sungai akan mempengaruhi proses siklus yang berlangsung. Sungai yang tercemar akan mengakibatkan siklus air bisa mengalami gangguan. Air sungai yang kotor akan mengalir ke laut dan mencemari seluruh biota yang berada di dalamnya.\r\n" + //
            "\r\n" + //
            "\tSupaya tidak menjadi lebih parah, pencemaran sungai perlu dicegah dan perlu adanya langkah untuk mengembalikan kondisi sungai menjadi seperti sediakala. Mencegah pencemaran sungai bukanlah proses yang mudah. Oleh karena itulah, perlu adanya kontribusi dari setiap masyarakat untuk bisa ikut serta menjaga kondisi sungai supaya bisa tetap terjaga dengan baik.\r\n" + //
            "\r\n" + //
            "\tHidup di bantaran sungai memiliki risiko yang cukup tinggi mengalami pencemaran air. Tak hanya itu, risiko terkena banjir juga besar. Ada baiknya saat mencari hunian, pilihlah hunian yang bebas banjir dan asri, supaya Anda bisa merasa tenang saat musim hujan tiba.\r\n" + //
            "\r\n" + //
            "2. Penyebab Pencemaran Sungai\r\n" + //
            "\tPenyebab pencemaran sungai yang paling utama adalah diakibatkan oleh campur tangan manusia yang tidak bertanggung jawab. Mengutip dari situs Young People\u2019s Trust For the Environment, berikut ini adalah beberapa penyebab pencemaran sungai.\r\n" + //
            "\ta. Penggunaan Pupuk dalam Jumlah Besar\r\n" + //
            "\t\tPupuk merupakan salah satu penyebab terjadinya pencemaran sungai. Apabila sejumlah besar pupuk atau limbah pertanian mengalir ke sungai, konsentrasi fosfat dan nitrat di dalam sungai akan meningkat dengan pesat. Tingginya konsentrasi fosfat dan nitrat akan membuat alga menjadi lebih mudah untuk tumbuh dan berkembang, yang mengakibatkan badan sungai menjadi tercemar. Alga dalam jumlah yang tinggi akan membuat biota sungai menjadi sulit untuk mendapatkan nutrisi dan tidak bisa hidup dalam waktu yang lama.\r\n" + //
            "\tb. Limbah Industri\r\n" + //
            "\t\tProduk limbah kimia dari hasil akhir industri terkadang secara tidak sengaja terbuang ke sungai. Polutan seperti seng, tembaga, sianida, hingga merkuri masuk ke sungai dalam jumlah yang besar. Polutan berbahaya tersebut akan membuat air sungai menjadi beracun dan mengakibatkan seluruh makhluk hidup yang ada di dalamnya mati.\r\n" + //
            "\tc. Limbah Rumah Tangga\r\n" + //
            "\t\tTahukah Anda bahwa limbah rumah tangga berkontribusi dari terjadinya pencemaran sungai? Deterjen yang digunakan untuk mencuci pakaian memiliki kandungan kimia dan asam yang tinggi. Apabila air bekas mencuci terbuang ke sungai, kandungan kimia dan asam tersebut akan mengubah tingkat keasaman dan mencemari sungai dengan cepat.\r\n" + //
            "\td. Tumpahan Bahan Bakar\r\n" + //
            "\t\tBahan bakar yang terbuang ke badan sungai akan membuat lapisan berwarna pelangi di seluruh permukaan sungai. Lapisan tersebut mencegah oksigen masuk ke dalam sungai, yang mengakibatkan makhluk hidup di dalamnya akan sulit untuk bernapas.\r\n" + //
            "\te. Limbah Air Panas\r\n" + //
            "\t\tBeberapa industri dan pabrik besar sering menggunakan air sebagai salah satu proses pendinginan dari alat-alat yang ada. Air hangat yang dibuang ke sungai akan membuat suhu dari sungai mengalami perubahan dan membuat kadar oksigen di dalamnya menjadi berkurang. Air sungai yang hangat juga akan mempengaruhi makhluk hidup dan membuatnya menjadi sulit untuk berkembang biak.\r\n" + //
            "\r\n" + //
            "3. Dampak Buruk Akibat Pencemaran Sungai\r\n" + //
            "\tDampak dari pencemaran sungai sangatlah merusak. Berdasarkan penelitian yang dilakukan WHO (World Health Organization), memperkirakan bahwa terdapat setidaknya 485.000 kasus kematian oleh diare yang diakibatkan buruknya kondisi air, terutama sungai. Dampak pencemaran sungai tidak hanya terhadap ekosistem yang ada di dalamnya, tetapi juga berdampak pada manusia, tumbuhan, dan hewan yang hidup di sekitarnya. Berikut ini adalah beberapa dampak buruk yang diakibatkan oleh pencemaran sungai.\r\n" + //
            "\ta. Mempengaruhi Flora dan Fauna\r\n" + //
            "\t\tBahan kimia dan limbah yang mencemari sungai menyebabkan beberapa spesies kehidupan yang ada di dalam air menjadi punah atau pindah ke tempat lain yang lebih aman. Pencemaran sungai juga dapat mengancam kondisi biosfer dan kawasan konservasi alam yang ada di sekitar kawasan sungai.\r\n" + //
            "\tb. Kehilangan Nyawa Manusia\r\n" + //
            "\t\tNelayan yang memancing di kawasan sungai akan lebih sulit untuk mendapatkan tangkapan ikan yang masih sehat dan belum tercemar oleh limbah. Ikan sungai yang tercemar limbah sangat berbahaya untuk dikonsumsi oleh manusia. Ikan yang diambil dari sungai tercemar bisa mengandung berbagai logam berat seperti timbal dan merkuri yang bisa mengakibatkan efek jangka panjang seperti kematian pada manusia.\r\n" + //
            "\tc. Rusaknya Sistem Agrikultur\r\n" + //
            "\t\tAir sungai yang terkontaminasi oleh limbah industri tidak dapat digunakan untuk mengairi tanaman. Air yang sudah tercemar membuat benih tanaman tidak bisa tumbuh dengan normal dan mengakibatkan perkembangannya menjadi terhambat.\r\n" + //
            "\r\n" + //
            "4. Ciri-Ciri Sungai yang Tercemar\r\n" + //
            "\ta. Sungai yang sudah tercemar bisa dikenali dengan mudah. Berdasarkan penelitian yang dilakukan oleh Westcountry C.S.I., berikut ini adalah beberapa ciri-ciri dari sungai yang sudah tercemar.\r\n" + //
            "\tb. Ciri pencemaran sungai bisa terlihat dari warna sungai tersebut. Sungai yang bersih dan tidak tercemar tidak memiliki warna dan terlihat bening bersih. Apabila tercemar, warna dari sungai akan berubah menjadi coklat keruh dan menghitam.\r\n" + //
            "\tc. Sungai yang sudah tercemar umumnya akan mengeluarkan aroma yang tidak sedap dan menyengat.\r\n" + //
            "\td. Terdapat alga dan jamur yang tumbuh di badan sungai. Semakin banyak alga yang tumbuh di badan sungai, menandakan bahwa sungai tersebut sudah tercemar dengan berat.\r\n" + //
            "\te. Sungai yang sudah tercemar oleh deterjen rumah tangga bisa terlihat dari munculnya busa pada permukaan sungai.\r\n" + //
            "\r\n" + //
            "5. Cara Menjaga Sungai Tetap Bersih\r\n" + //
            "\ta. Menjaga kondisi sungai merupakan tanggung jawab yang perlu dilakukan oleh seluruh lapisan masyarakat. Sungai yang terbebas dari polusi bisa memberikan banyak sekali manfaat bagi makhluk hidup. Seperti yang tertuang pada situs Chesapeake Bay Foundation, berikut ini adalah cara menjaga sungai agar tetap bersih yang bisa Anda lakukan.\r\n" + //
            "\tb. Buanglah limbah rumah tangga dengan benar. Pisahkan limbah organik dan anorganik supaya tidak tercampur dalam satu kantong sampah yang sama. Hindari untuk membuang minyak bekas memasak ke saluran pembuangan air supaya tidak mencemari sungai.\r\n" + //
            "\tc. Kurangi untuk menggunakan pupuk dan pestisida pada tanaman di rumah.\r\n" + //
            "\td. Pelajari cara membuat septic tank di rumah yang benar supaya tidak terjadi kebocoran yang mengakibatkan limbah manusia terbuang ke sungai.\r\n" + //
            "\te. Lakukanlah gotong royong membersihkan sungai bersama warga sekitar rumah. Pembersihan sungai yang dilakukan secara berkala akan membuat tingkat pencemaran menjadi berkurang dengan cepat.\r\n" + //
            "\tf. Pemerintah bisa membuat sistem pengelolaan sampah terpadu yang berfungsi untuk memusatkan pengelolaan sampah yang ada pada suatu lingkungan. Sampah yang dikelola dengan baik dapat mengurangi terjadinya potensi pencemaran sungai.");
        
        ArticleSharedData article3 = new ArticleSharedData("Cara Pencegahan Pencemaran Air, Penting!", 
        "Photo/Ar3_Photo.jpg",
        "Pencemaran air termasuk pencemaran lingkungan hidup. Kondisi air yang tercemar sangat berbahaya bagi makhluk hidup, baik organisme yang tinggal di dalamnya, maupun manusia.\r\n" + // 
        "\r\n" + //
        "Dikutip dari buku Kesehatan Lingkungan (2010) karya Arif Sumantri, pencemaran air adalah kondisi menurunnya kualitas air sampai ke tingkat tertentu, yang menyebabkan air tidak bisa digunakan untuk berbagai kepentingan. \r\n" + //
        "\r\n" + //
        "Ada dua penyebab utama pencemaran air, yakni alam dan aktivitas manusia. \r\n" + //
        "\r\n" + //
        "Contoh pencemaran air yang disebabkan alam adalah banjir lahar dingin akibat erupsi gunung berapi. Sedangkan contoh pencemaran air akibat aktivitas manusia ialah air yang keruh dan berbau karena tumpukan sampah. \r\n" + //
        "\r\n" + //
        "Lantas, bagaimana cara mencegah pencemaran air? \r\n" + //
        "\r\n" + //
        "Berikut beberapa upaya yang bisa dilakukan untuk mencegah pencemaran air: \r\n" + //
        "\r\n" + //
        "Tidak membuang sampah di sumber air \r\n" + // 
        "Menurut Bunasor Sanim dalam buku Sumber Daya Air dan Kesejahteraan Publik (2011), salah satu cara mencegah pencemaran air ialah tidak membuang sampah di sumber air. \r\n" + //
        "Sampah yang dibuang di sumber air, seperti sungai, danau, dan rawa, tidak hanya menyebabkan pencemaran air, melainkan turut menjadi penyebab bencana, misalnya banjir dan tanah longsor. \r\n" + //
        "Sebab itu, buanglah sampah pada tempatnya. Jangan membuang sampah sembarangan, termasuk area sumber air. Karena bisa menimbulkan pencemaran dan menyebabkan bencana. \r\n" + //
        "\r\n" + //
        "Mengolah air limbah \r\n" + //
        "Pengolahan air limbah juga sangat penting untuk mencegah pencemaran air. Pengolahan dilakukan untuk membersihkan air dari berbagai zat atau organisme berbahaya. \r\n" + //
        "Biasanya proses pengolahan ini dilakukan dengan bantuan mesin atau teknologi. Setelah diolah, air limbah biasanya dibuang atau dialirkan ke tempat yang sudah ditentukan. \r\n" + //
        "\r\n" + //
        "Menggunakan bahan ramah lingkungan \r\n" + //
        "Upaya pencegahan pencemaran air juga bisa dilakukan dengan menggunakan bahan ramah lingkungan. Contohnya detergen ramah lingkungan. \r\n" + //
        "Penggunaan bahan ramah lingkungan bisa mencegah pencemaran air, dan membuat lingkungan sekitar menjadi lebih sehat, aman, dan nyaman. \r\n" + //
        "\r\n" + //
        "Rutin membersihkan daerah sumber air \r\n" + //
        "Membersihkan daerah sumber air secara rutin juga bisa dilakukan sebagai cara mencegah pencemaran air. Selain itu, pembersihan daerah sumber air juga bisa meminimalisasi timbulnya penyakit atau bencana yang disebabkan aktivitas manusia.");

        ArticleSharedData article4 = new ArticleSharedData("Jelajah Sungai Cijulang- Green Canyon, Ada Air Terjun Abadi!", 
        "Photo/Ar4_Photo.jpg", 
        "Pangandaran - Jika pillihan liburan kamu ke Pangandaran, jangan sampai lewatkan berlibur ke objek wisata Green Canyon atau Cukang Taneuh di Desa Kertayasa, Kecamatan Cijulang, Kabupaten Pangandaran.\r\n" + //
        "Untuk menuju Green Canyon, dari Bunderan Marlin jaraknya sekitar 25 Km atau setara 30 menit perjalanan apabila ditempuh melalui jalur darat.\r\n" + //
        "\r\n" + //
        "Apabila detikers backpakeran, bisa menggunakan angkot atau bus dari terminal Pangandaran jurusan Cijulang, lalu naik ojek menuju dermaga Green Canyon.\r\n" + //
        "\r\n" + //
        "Setelah sampai di dermaga, detikers bakal langsung diserbu para jasa penyedia perahu. Jangan khawatir soal harga tiket, semuanya sama. Tinggal detikers pilih.\r\n" + //
        "\r\n" + //
        "Masuklah ke lobi tiket untuk memesan perahu sekaligus pemandu. Namun, sangat disarankan kamu datang berkelompok jika akan ke Green Canyon. Sebab, harga per perahunya sudah berpaket.\r\n" + //
        "\r\n" + //
        "Helfi (22), pemandu wisata Green Canyon mengatakan, harga tiket paket biasa (tanpa renang) waktu 45 menit Rp 200.000 per perahu. \"Sedangkan paket renang waktu 30 menit di Batu Payung Rp 300.000 dan Paket Renang waktu 1 jam di Pemandian Putri sebesar Rp400.000 per perahu,\" katanya. Minggu (27/2/2022).\r\n" + //
        "\r\n" + //
        "Sementara untuk harga tiket Rp200.000 per perahu dengan maksimal 5 orang. Selain itu bayi/anak kecil masih terhitung orang dewasa.\r\n" + //
        "\r\n" + //
        "\"Apabila ada ektra time 100.000 ribu per 30 menit untuk satu perahu. Apabila pengunjung membeli paket biasa tanpa renang dan di lokasi ingin berenang, pengunjung bisa membayar langsung kepada juru mudi,\" ucapnya.\r\n" + //
        "\r\n" + //
        "Perjalanan dari dermaga Cisereuh menuju dermaga 2 Green Canyon ditempuh sekitar 15-30 menit. Sepanjang jalan, detikers bakal disugugi dengan sungai yang memesona dan memanjakan mata, hijau pekat dengan tepian sungai batuan yang elok.\r\n" + //
        "\r\n" + //
        "Kondisi setiap pohon sepanjang sungai Cijulang yang masih asri menjadi khas perjalanan menyusuri aliran tersebut. Sesampainya di Green Canyon, detikers akan melihat hal yang menakjubkan.\r\n" + //
        "\r\n" + //
        "Ada batuan stalaktit dan stalagmit, jenis batuan yang berada diantara dinding Green Canyon. Di sana detikers akan melihat air terjun abadi atau tetesan air. Warga sekitar akrab menyebut air terjun Palatar yang terdapat pada mulut gua.\r\n" + //
        "\r\n" + //
        "Menurut cerita warga sekitar, itulah yang disebut air terjun abadi tak terhingga. Bahkan, dalam kondisi kemarau panjang sekalipun, airnya tetap ada.\r\n" + //
        "\r\n" + //
        "Asal-usul Nama Green Canyon\r\n" + //
        "\r\n" + //
        "Menurut cerita warga sekitar, penamaan Green Canyon dipopulerkan seorang pelancong dari Perancis bernama Bill John pada 1993. Namun, warga sekitar populer meyebutnya Cukang Taneuh.\r\n" + //
        "\r\n" + //
        "Nama tersebut ternyata dijuluki Bill John karena sempat berkunjung ke Green Canyon yang berada di Colorado, Amerika Serikat. Kedua tempat ini dinilai memiliki kemiripan.\r\n" + //
        "\r\n" + //
        "Lalu, kenapa warga sekitar menyebutnya sebagai Cukang Taneuh? Itu karena ada batuan yang menghubungkan dua daerah, Kertayasa dan Batukaras. Dalam bahasa Sunda, ini disebut cukang taneuh yang berarti jembatan tanah.");
    
    SaveData save = new SaveData();

    @FXML
    private JFXButton Article1;

    @FXML
    private JFXButton Article2;

    @FXML
    private JFXButton Article3;

    @FXML
    private JFXButton Article4;

    @FXML
    private void keHomePage (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/HomePage.fxml");
    }

    @FXML
    private void keCekStatusMutu (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/StatusMutuAir.fxml");
    }

    @FXML
    private void keArticlePage (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticlePage.fxml");
    }

    @FXML
    private void keArticle (ActionEvent event){
        for (int i = 0; i<article.size(); i++){
           if(i==0){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/Article.fxml");
    }

    @FXML
    private void keArticle2 (ActionEvent event){
        for (int i = 0; i<article.size(); i++){
           if(i==1){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/Article.fxml");
    }

    @FXML
    private void keArticle3 (ActionEvent event) {
        for (int i = 0; i<article.size(); i++){
           if(i==2){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/Article.fxml");
    
    }

    @FXML
    private void keArticle4 (ActionEvent event) {
        for (int i = 0; i<article.size(); i++){
           if(i==3){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/Article.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        article.add(article1);
        article.add(article2);
        article.add(article3);
        article.add(article4);
        
        save.saveData2(article, "Article");
    }    
    
}
