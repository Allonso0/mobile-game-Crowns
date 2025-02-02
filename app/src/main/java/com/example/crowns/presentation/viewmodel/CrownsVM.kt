package com.example.crowns.presentation.viewmodel

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.crowns.presentation.view.activity.MainActivity

class CrownsVM : ViewModel() {

    var score by mutableFloatStateOf(0f)
    var timerMinutes by mutableFloatStateOf(0f)
    var timerSeconds by mutableFloatStateOf(0f)

}