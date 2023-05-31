package dev.tuna.leechunbok.robin

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import dev.tuna.leechunbok.resource.LeechunbokTheme

@Preview(showBackground = true)
@Composable
fun RobinScreen() {
    LeechunbokTheme {
        Surface {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Robin Screen",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}