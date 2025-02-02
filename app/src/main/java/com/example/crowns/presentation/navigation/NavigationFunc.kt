package com.example.crowns.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.crowns.presentation.view.composable.CrownsRulesScreen
import com.example.crowns.presentation.view.composable.CrownsScreen
import com.example.crowns.presentation.view.composable.CrownsSettingsScreen
import com.example.crowns.presentation.view.composable.KillerSudokuRulesScreen
import com.example.crowns.presentation.view.composable.KillerSudokuScreen
import com.example.crowns.presentation.view.composable.KillerSudokuSettingsScreen
import com.example.crowns.presentation.view.composable.MainMenuScreen
import com.example.crowns.presentation.view.composable.NQueensRulesScreen
import com.example.crowns.presentation.view.composable.NQueensScreen
import com.example.crowns.presentation.view.composable.NQueensSettingsScreen
import com.example.crowns.presentation.view.composable.StatisticsScreen

@Composable
fun NavigationFunc() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "MainMenu"
    ) {
        composable("MainMenu") {
            MainMenuScreen(navController)
        }

        composable("Crowns") {
            CrownsScreen(navController)
        }

        composable("CrownsRules") {
            CrownsRulesScreen(navController)
        }

        composable("CrownsSettings") {
            CrownsSettingsScreen(navController)
        }

        composable("KillerSudoku") {
            KillerSudokuScreen(navController)
        }

        composable("KillerSudokuRules") {
            KillerSudokuRulesScreen(navController)
        }

        composable("KillerSudokuSettings") {
            KillerSudokuSettingsScreen(navController)
        }

        composable("NQueens") {
            NQueensScreen(navController)
        }

        composable("NQueensRules") {
            NQueensRulesScreen(navController)
        }

        composable("NQueensSettings") {
            NQueensSettingsScreen(navController)
        }

        composable("Statistics") {
            StatisticsScreen(navController)
        }
    }
}