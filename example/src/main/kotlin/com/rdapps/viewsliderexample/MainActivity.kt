package com.rdapps.viewsliderexample

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rdapps.viewsliderexample.ui.theme.ViewSliderTheme
import com.rdapps.viewslider.ViewSlider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewSliderTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

data class Item(
    val icon: ImageVector,
    val name: String,
    val selectedColor: Color
)

@Composable
fun MainScreen() {
    val list = listOf(
        Item(Icons.Filled.AccountCircle, "Profile Info", Color(0xFFE57373)),
        Item(Icons.Filled.ShoppingCart, "Cart", Color(0xFF81C784)),
        Item(Icons.Filled.Favorite, "Favorites", Color(0xFF64B5F6)),
        Item(Icons.Filled.Settings, "Settings", Color(0xFFFFD54F))
    )

    var selectedItem by remember { mutableStateOf(list.first()) }

    ViewSlider(
        items = list,
        scaleDownFactor = 0.4f,
        itemWidth = 80.dp,
        selectedItemIndicator = {
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                tint = it.selectedColor,
                contentDescription = null
            )
        },
        selectedItemLabel = {
            Text(
                text = it.name,
                color = it.selectedColor
            )
        },
        onItemSelected = { _, item ->
            selectedItem = item
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            imageVector = it.icon,
            contentDescription = null,
            colorFilter = ColorFilter.tint(
                if (it == selectedItem)
                    it.selectedColor
                else
                    MaterialTheme.colorScheme.onSurface
            ),
            modifier = Modifier.size(72.dp)
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MainScreenPreview() {
    ViewSliderTheme {
        MainScreen()
    }
}