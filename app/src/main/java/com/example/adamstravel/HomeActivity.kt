package com.example.adamstravel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adamstravel.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvTra: RecyclerView
    private var list: ArrayList<Data> = arrayListOf()

    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        rvTra = findViewById(R.id.rv_list)
        rvTra.setHasFixedSize(true)

        list.addAll(ObjectData.listData)

        setupHorRV()
    }

/*    private fun showRecyclerList() {
        rvTra.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvTra.adapter = listHeroAdapter

        val rvList : RecyclerView = findViewById(R.id.rv_list)
        rvList.setOnClickListener(this)
    }*/

    private fun setupHorRV() {
        binding.rvList.apply {
            setHasFixedSize(true)
            layoutManager =
                LinearLayoutManager(this@HomeActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = ListHeroAdapter(ObjectData.listData)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.rv_list -> startActivity(Intent(this, DetailActivity::class.java))
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}