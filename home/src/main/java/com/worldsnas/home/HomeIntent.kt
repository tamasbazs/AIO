package com.worldsnas.home

import com.worldsnas.mvi.MviIntent

sealed class HomeIntent : MviIntent {
    object Initial : HomeIntent()
}