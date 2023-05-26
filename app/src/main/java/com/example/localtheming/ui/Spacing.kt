package com.example.localtheming.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Spacing(
    val default : Dp = 0.dp,
    val small : Dp = 6.dp,
    val medium : Dp = 10.dp
)

val LocalSpacing = compositionLocalOf {
    Spacing()
} // creating local composition

//to extend material theme class
val MaterialTheme.spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current