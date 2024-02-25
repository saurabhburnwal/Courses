package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topicResourceId: Int,
    val subscript: Int,
    @DrawableRes val imageResourceId: Int
)
