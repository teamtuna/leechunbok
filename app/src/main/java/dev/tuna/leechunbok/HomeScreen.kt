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
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.tuna.leechunbok.easterdev.EastarScreen
import dev.tuna.leechunbok.kade.app.KadeScreen
import dev.tuna.leechunbok.noah.NoahScreen
import dev.tuna.leechunbok.resource.LeechunbokTheme
import dev.tuna.leechunbok.robin.RobinScreen


sealed class HomeScreen(val route: String) {
    object HOME : HomeScreen("home")

    object EAST_JUNG : HomeScreen("EAST_JUNG")

    object NOAH : HomeScreen("NOAH")

    object JUYOUNG : HomeScreen("JUYOUNG")

    object ROBIN : HomeScreen("ROBIN")

    object KADE : HomeScreen("KADE")
}

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HomeScreen.HOME.route
    ) {
        composable(HomeScreen.HOME.route) {
            ButtonScreen(navController)
        }

        composable(HomeScreen.EAST_JUNG.route) {
            EastarScreen()
        }

        composable(HomeScreen.NOAH.route) {
            NoahScreen()
        }

        composable(HomeScreen.JUYOUNG.route) {
            WhaleSharkScreen()
        }

        composable(HomeScreen.ROBIN.route) {
            RobinScreen(navController)
        }

        composable(HomeScreen.KADE.route) {
            KadeScreen()
        }
    }
}

@Composable
private fun ButtonScreen(navController: NavHostController) {
    MemberButtons(members = TunaMember.values()) { member ->
        when (member) {
            TunaMember.EAST_JUNG -> {
                navController.navigate(HomeScreen.EAST_JUNG.route)
            }

            TunaMember.NOAH -> {
                navController.navigate(HomeScreen.NOAH.route)
            }

            TunaMember.JUYOUNG -> {
                navController.navigate(HomeScreen.JUYOUNG.route)
            }

            TunaMember.ROBIN -> {
                navController.navigate(HomeScreen.ROBIN.route)
            }

            TunaMember.KADE -> {
                navController.navigate(HomeScreen.KADE.route)
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