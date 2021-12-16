package com.example.adamstravel

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.adamstravel.databinding.RowItemHomeBinding

class ListHeroAdapter(private val listHero: ArrayList<Data>) :
    RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    inner class ListViewHolder(private val rowItemBinding: RowItemHomeBinding) :
        RecyclerView.ViewHolder(rowItemBinding.root) {
        //        var tvTitle: TextView = itemView.findViewById(R.id.tv_titlee)
//        var tvSubTitle: TextView = itemView.findViewById(R.id.tv_subtitlee)
//        var imgI: ImageView = itemView.findViewById(R.id.iv_list)
        fun bindItem(data: Data) {
            rowItemBinding.tvTitlee.text = data.title
            rowItemBinding.tvSubtitlee.text = data.subTitle
            rowItemBinding.ivList.setImageResource(data.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ListViewHolder(
        RowItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(listHero[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.DATA_IMAGE, listHero[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }


}

