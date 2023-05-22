package com.renderos.estado_tracker.repositories

import com.renderos.estado_tracker.data.model.EstadoModel

class EstadoRepository(private val capitals: MutableList<EstadoModel>) {

    fun getCapitals() = capitals

    // Agregando capitals

    fun addCapitals(capital: EstadoModel) = capitals.add(capital)

}