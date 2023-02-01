package com.dralsoft.composecatalogo

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun SimpleRecyclerView() {
    val myList = listOf(
        "Item 1", "Item 2", "Item 3", "Item 4",
        "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10"
    )
    LazyColumn {

        items(myList) {
            Text(text = "Item $it")
        }
    }
}