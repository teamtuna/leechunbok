package dev.tuna.leechunbok.robin

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun ButtonComponentScreen() {
    Surface {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                modifier = Modifier.wrapContentSize(),
                text = stringResource(id = R.string.button_component_title),
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
        }
    }
}