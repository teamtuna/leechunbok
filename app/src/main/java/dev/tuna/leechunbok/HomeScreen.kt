package dev.tuna.leechunbok

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.tuna.leechunbok.ui.theme.LeechunbokTheme

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Greeting("Android")
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LeechunbokTheme {
        Greeting("Android")
    }
}