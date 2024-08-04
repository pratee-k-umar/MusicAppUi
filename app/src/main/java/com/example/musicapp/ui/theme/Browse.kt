package com.example.musicapp.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.musicapp.R


@Composable
fun Browse() {
    val browseCategories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 200.dp)) {
        items(browseCategories.size) {
            BrowserItem(category = browseCategories[it], drawable = R.drawable.baseline_library_music_24)
        }
    }
}