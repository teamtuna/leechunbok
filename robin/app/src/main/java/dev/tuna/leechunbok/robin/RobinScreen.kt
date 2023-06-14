package dev.tuna.leechunbok.robin

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import dev.tuna.leechunbok.resource.LeechunbokTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun RobinScreen() {
    LeechunbokTheme {
        val navController = rememberNavController()
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = stringResource(id = R.string.robin_screen_title)) },
                    navigationIcon = {
                        IconButton(onClick = {
                            navController.popBackStack()
                        }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = Icons.Default.ArrowBack.name
                            )
                        }
                    }
                )
            }) { padding ->
            Column(Modifier.padding(padding)) {
                RobinComponentTabRow(listOf("Tab1", "Tab2", "Tab3"))
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RobinComponentTabRow(items: List<String>) {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()
    TabRow(selectedTabIndex = pagerState.currentPage) {
        items.forEachIndexed { index, title ->
            Tab(
                text = {
                    Text(text = title)
                },
                selected = pagerState.currentPage == index,
                onClick = {
                    coroutineScope.launch {
                        pagerState.scrollToPage(index)
                    }
                })
        }
    }

    HorizontalPager(pageCount = items.size, state = pagerState) { page ->
        Text(
            modifier = Modifier.wrapContentSize(),
            text = page.toString(),
            textAlign = TextAlign.Center,
            fontSize = 30.sp
        )
    }
}
