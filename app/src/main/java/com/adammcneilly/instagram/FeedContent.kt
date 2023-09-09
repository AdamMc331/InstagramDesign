package com.adammcneilly.instagram

import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.instagram.theme.InstagramTheme

@Composable
fun FeedContent(
    modifier: Modifier = Modifier,
) {
    Surface {
        LazyColumn(
            modifier = modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
        ) {
            item {
                InstagramSearchBar(
                    modifier = Modifier
                        .fillMaxWidth(),
                )
            }
        }
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
private fun FeedContentPreview() {
    InstagramTheme {
        FeedContent()
    }
}
