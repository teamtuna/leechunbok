package dev.tuna.leechunbok

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import dev.tuna.leechunbok.resource.LeechunbokTheme

@Preview(showBackground = true)
@Composable
fun WhaleSharkScreen() {
    LeechunbokTheme {
        Surface(Modifier.fillMaxSize()) {
            GridImages()
        }
    }
}

@Composable
private fun GridImages() {
    val gridItems = (1..20).toList()
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        items(gridItems) { item ->
            GridItem(item)
        }
    }
}

@Composable
fun GridItem(item: Int) {
    val imageUrl = "https://image.utoimage.com/preview/cp872722/2022/12/202212008462_206.jpg"
    Card {

        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = "My Image",
            modifier = Modifier.size(128.dp)
        )
    }
}