package com.renderos.estado_tracker.data

import com.renderos.estado_tracker.data.model.EstadoModel

// Data of first state
val name = "Brasil"
val capital = "Mongolia"

// data of second state

val name2 = "El Salvador"
val capital2 = "San Salvador"

var capitals = mutableListOf(
    EstadoModel(name, capital),
    EstadoModel(name2, capital2)
)