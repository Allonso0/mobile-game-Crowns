package com.example.crowns.data.repository

import com.example.crowns.domain.model.Difficulty
import com.example.crowns.domain.model.KillerSudokuBoard

interface IKillerSudokuRepository {
    fun generateBoard(difficulty: Difficulty) : KillerSudokuBoard
    fun verifySolution(board: KillerSudokuBoard) : Boolean
}