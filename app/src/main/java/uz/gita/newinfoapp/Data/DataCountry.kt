package uz.gita.newinfoapp.Data

import java.io.Serializable

data class DataCountry(
    val image1: Int,
    val image2: Int,
    val country_name: String,
    val location_name: String,
    val location: String,
    val information: String
) : Serializable