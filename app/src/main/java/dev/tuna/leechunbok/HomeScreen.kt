package dev.tuna.leechunbok

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.tuna.leechunbok.resource.LeechunbokTheme


sealed class HomeScreen(val route: String) {
    object EAST_JUNG : HomeScreen("EAST_JUNG")

    object NOAH : HomeScreen("NOAH")

    object JUYOUNG : HomeScreen("JUYOUNG")

    object ROBIN : HomeScreen("ROBIN")

    object KADE : HomeScreen("KADE")
}

@Preview(showBackground = true)
@Composable
fun HomeScreen() {

    Column(modifier = Modifier.fillMaxSize()) {
        MemberButtons(members = TunaMember.values()) { member ->
            when (member) {
                TunaMember.EAST_JUNG -> {}
                TunaMember.NOAH -> {}
                TunaMember.JUYOUNG -> {}
                TunaMember.ROBIN -> {}
                TunaMember.KADE -> {}
            }
        }
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = HomeScreen.EAST_JUNG.route
        ) {
            composable(HomeScreen.EAST_JUNG.route) {

            }
            composable(HomeScreen.NOAH.route) {

            }

            composable(HomeScreen.JUYOUNG.route) {

            }

            composable(HomeScreen.ROBIN.route) {

            }

            composable(HomeScreen.KADE.route) {

            }
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
    LeechunbokTheme {
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