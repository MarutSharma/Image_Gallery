package com.example.image_gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.image_gallery.databinding.LayoutImgCardBinding

class ImageAdapter(
    private val layout: Int,
    private val images: List<Image>,
    val onItemClick: (Image) -> Unit,
    val onIconClick: (Image) -> Unit
) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding: LayoutImgCardBinding = LayoutImgCardBinding.bind(itemView)
        fun bind(item: Image) {
            binding.apply {
                txtTitle.text = item.title
                imgAvatar.setImageResource(item.image)
                imgFav.setImageResource(if (item.status) R.drawable.baseline_favorite_24 else R.drawable.baseline_favorite_border_24)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(images[position])
        holder.binding.card.setOnClickListener { onItemClick(images[position]) }
        holder.binding.imgFav.setOnClickListener { onIconClick(images[position]) }
    }


    override fun getItemCount() = images.size


}