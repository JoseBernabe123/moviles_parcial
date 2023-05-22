package com.renderos.estado_tracker

import android.app.Application
import com.renderos.estado_tracker.data.capitals
import com.renderos.estado_tracker.repositories.EstadoRepository

class EstadoReviewerApplication : Application() {
    val estadoRepository: EstadoRepository by lazy {
        EstadoRepository(capitals)
    }
}