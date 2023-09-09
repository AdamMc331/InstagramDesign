package com.adammcneilly.instagram

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.instagram.theme.InstagramTheme

@Composable
fun InstagramStoryRow(
    configs: List<InstagramStoryCircle.Config>,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(
            horizontal = 16.dp,
        ),
        horizontalArrangement = Arrangement.spacedBy(32.dp),
    ) {
        items(configs) { config ->
            InstagramStoryCircle(
                config = config,
            )
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
private fun InstagramStoryRowPreview() {
    val configs = listOf(
        InstagramStoryCircle.Config(
            profilePhotoRes = R.drawable.paris,
            displayName = "Adam",
        ),
        InstagramStoryCircle.Config(
            profilePhotoRes = R.drawable.paris,
            displayName = "Adam",
        ),
        InstagramStoryCircle.Config(
            profilePhotoRes = R.drawable.paris,
            displayName = "Adam",
        ),
        InstagramStoryCircle.Config(
            profilePhotoRes = R.drawable.paris,
            displayName = "Adam",
        ),
    )

    InstagramTheme {
        InstagramStoryRow(
            configs = configs,
        )
    }
}
