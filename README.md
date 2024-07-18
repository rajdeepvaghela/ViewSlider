# View Slider
[![Release](https://jitpack.io/v/com.github.rajdeepvaghela/ViewSlider.svg)](https://jitpack.io/#com.github.rajdeepvaghela/VerticalStepper)
[![Release](https://img.shields.io/github/v/release/rajdeepvaghela/VerticalStepper)](https://github.com/rajdeepvaghela/VerticalStepper/releases)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

It is a Horizontal view slider which will snap the middle item, with the scale effect.

![Screen_recording_20240718_125304-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/dfc81adc-381a-4f32-9907-6de8b589f890)

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
    implementation 'com.github.rajdeepvaghela:VerticalStepper:1.0.0'
}
```
## Usage
```kotlin
            val stepData = StepData(
                id = 1L,
                stepState = StepState.Visible,
                title = "Title"
            )

            Step(
                stepData = stepData,
                onAnimationDone = {
                    
                }
            )
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
