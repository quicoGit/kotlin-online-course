package com.antonioleiva.myplayer

data class MediaItem(val title: String, val thumbUrl: String, val type: Type) {
    enum class Type { PHOTO, VIDEO }
}