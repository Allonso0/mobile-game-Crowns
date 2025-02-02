package com.example.crowns.domain.usecase

import com.example.crowns.data.repository.IKillerSudokuRepository
import com.example.crowns.domain.model.Difficulty
import com.example.crowns.domain.model.KillerSudokuBoard

class GenerateKillerSudokuUC(
    private val repository: IKillerSudokuRepository
) {
}