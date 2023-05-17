package dev.tuna.leechunbok

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tuna.leechunbok.resource.LeechunbokTheme

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    MemberButtons(members = TunaMember.values()) { member ->
        when (member) {
            TunaMember.EAST_JUNG -> {}
            TunaMember.NOAH -> {}
            TunaMember.JUYOUNG -> {}
            TunaMember.ROBIN -> {}
            TunaMember.KADE -> {}
        }
    }
}

@Composable
private fun MemberButtons(
    modifier: Modifier = Modifier,
    members: Array<TunaMember>,
    onClick: (TunaMember) -> Unit = { }
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        members.forEach { member ->
            Button(
                onClick = { onClick(member) },
                modifier = Modifier.fillMaxWidth()
            ) {
                val userName = stringResource(id = member.nameResource)
                Text(text = userName)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MemberButtonsPreview() {
    dev.tuna.leechunbok.resource.LeechunbokTheme {
        MemberButtons(members = TunaMember.values())
    }
}

enum class TunaMember(@StringRes val nameResource: Int) {
    EAST_JUNG(R.string.name_east_jung),
    NOAH(R.string.name_noah),
    JUYOUNG(R.string.name_whale_shark),
    ROBIN(R.string.name_robin),
    KADE(R.string.name_kade)
}