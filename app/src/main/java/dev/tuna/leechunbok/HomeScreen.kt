package dev.tuna.leechunbok

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tuna.leechunbok.ui.theme.LeechunbokTheme

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
                Text(text = member.koreanName)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MemberButtonsPreview() {
    LeechunbokTheme {
        MemberButtons(members = TunaMember.values())
    }
}

enum class TunaMember(val koreanName: String) {
    EAST_JUNG("정동진"),
    NOAH("김정우"),
    JUYOUNG("이주영"),
    ROBIN("최선일"),
    KADE("김지훈")
}