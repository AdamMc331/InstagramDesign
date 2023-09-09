package com.adammcneilly.instagram

import android.content.res.Configuration
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adammcneilly.instagram.theme.InstagramTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramSearchBar(
    modifier: Modifier = Modifier,
) {
    SearchBar(
        query = "Search In Instagram",
        onSearch = {},
        onQueryChange = {},
        active = false,
        onActiveChange = {},
        modifier = modifier,
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Account",
            )
        },
    ) {

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
private fun InstagramSearchBarPreview() {
    InstagramTheme {
        InstagramSearchBar()
    }
}
