package com.example.androiddevchallenge.ui

sealed class Screen {

    object Welcome : Screen()
    object Home : Screen()
}