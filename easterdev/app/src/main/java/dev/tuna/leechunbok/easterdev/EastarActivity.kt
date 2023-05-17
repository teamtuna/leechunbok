package dev.tuna.leechunbok.easterdev

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EastarScreen() {
    Text(
        text = "Hello eastar!",
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    dev.tuna.leechunbok.resource.LeechunbokTheme {
        EastarScreen()
    }
}