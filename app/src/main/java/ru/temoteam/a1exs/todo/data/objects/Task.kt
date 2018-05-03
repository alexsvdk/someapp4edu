package ru.temoteam.a1exs.todo.data.objects

import com.google.android.gms.maps.model.LatLng
import java.util.*

class Task(
        var title: String,
        var description: String,
        var startDate: Date,
        var endDate: Date,
        var remind: Boolean,
        var latLng: LatLng? = null,
        var imgUrl: String? = null
)