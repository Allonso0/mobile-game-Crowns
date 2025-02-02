package com.example.crowns.domain.usecase

import com.example.crowns.data.repository.IKillerSudokuRepository
import com.example.crowns.domain.model.KillerSudokuBoard

class VerifyKillerSudokuUC(
    private val repository: IKillerSudokuRepository
) {
}