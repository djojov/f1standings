package com.example.f1standings.models.constructors


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("season")
    val season: String
)