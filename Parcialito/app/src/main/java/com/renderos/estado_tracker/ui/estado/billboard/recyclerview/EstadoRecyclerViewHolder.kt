package com.renderos.estado_tracker.ui.estado.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.renderos.estado_tracker.data.model.EstadoModel

class EstadoRecyclerViewHolder(private val binding: EstadoItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: EstadoModel, clickListener: (EstadoModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qu

        binding.movieItemCardView.setOnClickListener {
            clickListener(movie)
        }
    }
}