package dev.tuna.leechunbok

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tuna.leechunbok.resource.LeechunbokTheme

@Preview(showBackground = true)
@Composable
fun WhaleSharkScreen() {
    LeechunbokTheme {
        Text(text = "Hello ~!")
    }
}