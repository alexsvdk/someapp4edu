package ru.temoteam.a1exs.todo.data.objects

import com.google.android.gms.maps.model.LatLng
import java.util.*

class Task(
        val title: String,
        val description: String,
        val startDate: Date,
        val endDate: Date,
        val remind: Boolean,
        val latLng: LatLng? = null,
        var imgUrl: String? = null
)