package com.adammcneilly.instagram

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.instagram.theme.InstagramTheme

@Composable
fun InstagramTabRow(
    modifier: Modifier = Modifier,
) {
    val selectedIndex = 0

    TabRow(
        selectedTabIndex = selectedIndex,
        indicator = { tabPositions ->
            if (selectedIndex < tabPositions.size) {
                val currentTab = tabPositions[selectedIndex]
                val indicatorWidth = currentTab.width * 0.5F
                val indicatorStartOffset = currentTab.left + (indicatorWidth * 0.5F)

                Box(
                    Modifier
                        .wrapContentSize(Alignment.BottomStart)
                        .offset(indicatorStartOffset)
                        .width(indicatorWidth)
                        .height(3.dp)
                        .background(color = MaterialTheme.colorScheme.primary)

                )
            }
        },
        modifier = modifier,
    ) {
        InstagramTab(
            text = "Home",
            selected = true,
        )

        InstagramTab(
            text = "Reels",
            selected = false,
        )
    }
}

@Composable
private fun InstagramTab(
    text: String,
    selected: Boolean,
    modifier: Modifier = Modifier,
) {
    Tab(
        selected = selected,
        onClick = { /*TODO*/ },
        modifier = modifier,
    ) {
        Text(
            text = text,
            modifier = modifier
                .padding(16.dp),
        )
    }
}

@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun InstagramTabRowPreview() {
    InstagramTheme {
        InstagramTabRow()
    }
}
