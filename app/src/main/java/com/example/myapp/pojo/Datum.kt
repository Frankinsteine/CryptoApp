package com.example.myapp.pojo

data class Datum (
        @SerializedName("CoinInfo")
        @Expose
        val CoinInfo: CoinInfo? = null;
        )