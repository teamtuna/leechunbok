package dev.tuna.leechunbok.robin.button

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tuna.leechunbok.resource.LeechunbokTheme


@Composable
fun FilledTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
        .wrapContentSize()
        .defaultMinSize(minHeight = 56.dp),
    content: String
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = ButtonDefaults.shape,
        colors = ButtonDefaults.buttonColors(),
        contentPadding = ButtonDefaults.ContentPadding,
        elevation = ButtonDefaults.buttonElevation()
    ) {
        Text(text = buildString {
            append(content)
        })
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FilledButtonPreview() {
    LeechunbokTheme {
        FilledTextButton(onClick = {}, content = "Primary Button")
    }
}