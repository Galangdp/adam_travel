package com.example.adamstravel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.adamstravel.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val DATA_IMAGE = "image"
        const val DATA_TITLE = "title"
        const val DATA_SUBTITTLE = "subtitle"
        const val DATA_PEMILIK = "pemilik"
        const val DATA_ARSITEK = "arsitek"
        const val DATA_LOKASI = "lokasi"
        const val DATA_PEMBUATAN = "pembuatan"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.hide()

        binding.btnPesen.setOnClickListener {
            Toast.makeText(this, "Perjalanan Anda Sudah Kami Tambahkan", Toast.LENGTH_SHORT).show()
        }

        val btnBackKeProfileActivity : ImageView = findViewById(R.id.btn_back)
        btnBackKeProfileActivity.setOnClickListener(this)


        val data = intent.getParcelableExtra<Data>(DATA_IMAGE)

        val image = intent.getIntExtra(DATA_IMAGE, 0)
        val title = intent.getStringExtra(DATA_TITLE)
        val subTitle = intent.getStringExtra(DATA_SUBTITTLE)
        val pemilik = intent.getStringExtra(DATA_PEMILIK)
        val arsitek = intent.getStringExtra(DATA_ARSITEK)
        val lokasi = intent.getStringExtra(DATA_LOKASI)
        val pembuat = intent.getStringExtra(DATA_PEMBUATAN)

        if (data != null) {
            binding.gambarWisata.setImageResource(data.img)
            binding.tvTitleee.text = data.title
            binding.tvYangPembuat.text = data.pembuatan
            binding.tvYangArsitek.text = data.arsitek
            binding.tvYangLokasi.text = data.lokasi
            binding.tvYangPemilik.text = data.pemilik
            binding.tvSubtitleee.text = data.subTitle
        } else {
            binding.gambarWisata.setImageResource(image)
            binding.tvTitleee.text = title
            binding.tvYangPembuat.text = pembuat
            binding.tvYangArsitek.text = arsitek
            binding.tvYangLokasi.text = lokasi
            binding.tvYangPemilik.text = pemilik
            binding.tvSubtitleee.text = subTitle
        }
//        val imgKota : ImageView = findViewById(R.id.gambar_wisata)
//        imgKota.setImageResource(image)
//
//        val tvTitle : TextView = findViewById(R.id.tv_titleee)
//        tvTitle.text = title
//
//        val tvSubtittle : TextView = findViewById(R.id.tv_subtitleee)
//        tvSubtittle.text = subTitle
//
//        val tvPemilik : TextView = findViewById(R.id.tv_yang_pemilik)
//        tvPemilik.text = pemilik
//
//        val tvArsitek : TextView = findViewById(R.id.tv_yang_arsitek)
//        tvArsitek.text = arsitek
//
//        val tvLokasi : TextView = findViewById(R.id.tv_yang_lokasi)
//        tvLokasi.text = lokasi
//
//        val tvPembuat : TextView = findViewById(R.id.tv_yang_pembuat)
//        tvPembuat.text = pembuat
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_back -> {
                val moveIntent = Intent(this@DetailActivity, HomeActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}