package com.example.adamstravel

object ObjectData {
    private val title = arrayOf(
        "Bundaran HI",
        "Monas",
        "Kota Tua",
        "Dufan",
        "Ancol"
    )

    private val subTitle = arrayOf(
        "Bundaran HI adalah sebuah halte bus Transjakarta yang terletak di Jalan M. H. Thamrin, Gondangdia, Menteng, Jakarta Pusat. Halte yang berada di Koridor 1 yang membentang dari utara ke selatan ini, namanya berasal dari Bundaran Hotel Indonesia yang terletak tidak jauh dari halte.\n\nHalte HI sempat ditutup untuk keperluan pembangunan MRT Jakarta pada 6 Januari 2014. Namun, sejak 24 Maret 2019, halte ini sudah kembali beroperasi dan terintegrasi dengan Stasiun MRT Bundaran HI yang terletak tepat dibawah halte ini.",
        "Monumen Nasional atau yang populer disingkat dengan Monas atau Tugu Monas adalah monumen peringatan setinggi 132 meter (433 kaki) yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda. Pembangunan monumen ini dimulai pada tanggal 17 Agustus 1961 di bawah perintah presiden Soekarno dan dibuka untuk umum pada tanggal 12 Juli 1975. Tugu ini dimahkotai lidah api yang dilapisi lembaran emas yang melambangkan semangat perjuangan yang menyala-nyala dari rakyat Indonesia. Monumen Nasional terletak tepat di tengah Lapangan Medan Merdeka, Jakarta Pusat.",
        "Kota tua di Jakarta, yang juga bernama Kota Tua, berpusat di Alun-Alun Fatahillah, yaitu alun-alun yang ramai dengan pertunjukan rutin tarian tradisional. Museum Sejarah Jakarta adalah bangunan era Belanda dengan lukisan dan barang antik, sedangkan Museum Wayang memamerkan boneka kayu khas Jawa. Desa Glodok, atau Chinatown, terkenal dengan makanan kaki lima, seperti pangsit dan mi goreng. Di dekatnya, terdapat sekunar dan kapal penangkap ikan di pelabuhan Sunda Kelapa yang kuno.",
        "Dufan atau disebut juga Dunia Fantasi adalah theme park yang terletak di kawasan Taman Impian Jaya Ancol, Jakarta Utara, Indonesia yang diresmikan dan dibuka untuk umum pada tanggal 29 Agustus 1985.",
        "Destinasi di tepi laut Ancol memiliki pantai yang populer untuk olahraga air dan kompleks di tepi laut yang dilengkapi rollercoaster serta wahana di Dunia Fantasi dan taman rekreasi air Atlantis Water Adventure. Keluarga juga dapat menikmati akuarium SeaWorld dengan hiu dan kura-kuranya, serta Ocean Dream Samudra yang menampilkan pertunjukan lumba-lumba dan singa laut. Pasar Seni Ancol menampilkan seniman lokal yang baru muncul dan mengadakan pertunjukan tarian di akhir pekan",
    )

    private val image = intArrayOf(
        R.drawable.bunhi,
        R.drawable.monas,
        R.drawable.kotu,
        R.drawable.dufan,
        R.drawable.ancol
    )

    private val pemilik = arrayOf(
        "Pemerintah Indonesia",
        "Pemerintah Indonesia",
        "Pemerintah Indonesia",
        "Pemerintah Indonesia",
        "Taman Impian Jaya Ancol"
    )

    private val arsitek = arrayOf(
        "Friedrich Silaban",
        "Soedarsono",
        "Marva",
        "Budi Priambodo",
        "Andra Matin"
    )

    private val lokasi = arrayOf(
        "Jakarta",
        "Jakarta",
        "Jakarta",
        "Jakarta",
        "Jakarta"
    )

    private val pembuatan = arrayOf(
        "Tahun 1959",
        "Tahun 1959",
        "Tahun 1526",
        "Tahun 1985",
        "Tahun 1960"
    )

    val listData: ArrayList<Data>
        get() {
            val list = arrayListOf<Data>()
            for (position in title.indices) {
                val trf = Data(
                    title = title[position],
                    subTitle = subTitle[position],
                    img = image[position],
                    pembuatan = pembuatan[position],
                    pemilik = pemilik[position],
                    arsitek = arsitek[position],
                    lokasi = lokasi[position],
                )

                list.add(trf)
            }
            return list
        }
}