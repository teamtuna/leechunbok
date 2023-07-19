package dev.tuna.leechunbok.robin

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tuna.leechunbok.resource.LeechunbokTheme
import dev.tuna.leechunbok.robin.button.FilledTextButton

@Composable
fun ButtonComponentScreen() {
    Surface {
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            FilledTextButton(onClick = {
                Toast.makeText(context, "Sample Button Clicked", Toast.LENGTH_SHORT).show()
            }, content = "Sample Button")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ButtonComponentPreview() {
    LeechunbokTheme {
        ButtonComponentScreen()
    }
}