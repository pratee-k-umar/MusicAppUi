package com.example.musicapp.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeView() {
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    val grouped = listOf("New Release", "Favourites", "Top Rated").groupBy { it[0] }
    LazyColumn {
        grouped.forEach {
            stickyHeader {
                Text(
                    text = it.value[0],
                    modifier = Modifier.padding(16.dp)
                )
                LazyRow {
                    items(categories) { category ->
                        BrowserItem(category = category, drawable = R.drawable.baseline_library_music_24)
                    }
                }
            }
        }
    }
}
@Composable
fun BrowserItem(category: String, drawable: Int) {
    ElevatedCard(
        modifier = Modifier
            .padding(16.dp)
            .size(200.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = category)
            Image(
                painter = painterResource(id = drawable),
                contentDescription = null
            )
        }
    }
}