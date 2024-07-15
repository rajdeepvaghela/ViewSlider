# View Slider
[![Release](https://jitpack.io/v/com.github.rajdeepvaghela/ViewSlider.svg)](https://jitpack.io/#com.github.rajdeepvaghela/ViewSlider)
[![Release](https://img.shields.io/github/v/release/rajdeepvaghela/ViewSlider)](https://github.com/rajdeepvaghela/ViewSlider/releases)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

It is a Horizontal view slider which will snap the middle item, with the scale effect.

![image](https://github.com/rajdeepvaghela/ViewSlider/assets/17750025/ff610205-d4f7-4edf-a39e-1a73f8526176)

## Installation
Add it in your root build.gradle or settings.gradle at the end of repositories:
```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
      mavenCentral()
      maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency
```gradle
dependencies {
    implementation 'com.github.rajdeepvaghela:ViewSlider:1.0.0'
}
```
## Usage
```kotlin
    ViewSlider(
        items = listOf(
            Item(Icons.Filled.AccountCircle, "Profile Info", Color(0xFFE57373)),
            Item(Icons.Filled.ShoppingCart, "Cart", Color(0xFF81C784)),
            Item(Icons.Filled.Favorite, "Favorites", Color(0xFF64B5F6)),
            Item(Icons.Filled.Settings, "Settings", Color(0xFFFFD54F))
        ),
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
        onItemSelected = { index, item ->
            // do action on item selection
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            imageVector = it.icon,
            contentDescription = null,
            colorFilter = ColorFilter.tint(it.selectedColor),
            modifier = Modifier.size(72.dp)
        )
    }
```

## License
```
Copyright 2024 Rajdeep Vaghela

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
