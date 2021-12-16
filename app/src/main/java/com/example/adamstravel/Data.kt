package com.example.adamstravel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data (
        var title : String ,
        var subTitle : String,
        var img : Int ,
        var pemilik : String ,
        var arsitek : String ,
        var lokasi : String,
        var pembuatan : String ,
):Parcelable
