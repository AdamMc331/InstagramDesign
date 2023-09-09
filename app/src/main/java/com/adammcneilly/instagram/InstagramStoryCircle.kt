package com.adammcneilly.instagram

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.adammcneilly.instagram.theme.InstagramTheme

@Composable
fun InstagramStoryCircle(
    config: InstagramStoryCircle.Config,
    modifier: Modifier = Modifier,
    imageSize: Dp = 64.dp,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Image(
            painter = painterResource(id = config.profilePhotoRes),
            contentDescription = "View Story",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(imageSize)
                .border(1.dp, MaterialTheme.colorScheme.primary, CircleShape)
                .padding(2.dp)
                .clip(CircleShape),
        )

        Text(
            text = config.displayName,
        )
    }
}

object InstagramStoryCircle {
    data class Config(
        val profilePhotoRes: Int,
        val displayName: String,
        val showAddButton: Boolean = false,
    )
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
private fun InstagramStoryCirclePreview() {
    InstagramTheme {
        InstagramStoryCircle(
            config = InstagramStoryCircle.Config(
                R.drawable.paris,
                "Adam",
            ),
            modifier = Modifier
                .size(48.dp),
        )
    }
}
