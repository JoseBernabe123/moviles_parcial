package com.renderos.estado_tracker.ui.estado.billboard.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.renderos.estado_tracker.data.model.EstadoModel

class MovieRecyclerViewAdapter(
    private val clickListener: (EstadoModel) -> Unit
) : RecyclerView.Adapter<EstadoRecyclerViewHolder>()  {
    private val movies = ArrayList<EstadoModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadoRecyclerViewHolder {
        val binding = EstadoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EstadoRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: EstadoRecyclerViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie, clickListener)
    }

    fun setData(moviesList: List<EstadoModel>) {
        movies.clear()
        movies.addAll(moviesList)
    }
}