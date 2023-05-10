// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.3.1" apply false
    id("com.android.library") version "7.3.1" apply false
    //https://developer.android.com/jetpack/androidx/releases/compose-kotlin
    kotlin("android") version "1.8.10" apply false

    id("androidx.navigation.safeargs.kotlin") version "2.5.1" apply false

    //https://dagger.dev/hilt/gradle-setup.html
    id("com.google.dagger.hilt.android") version "2.45" apply false

    //https://github.com/mannodermaus/android-junit5
    id("de.mannodermaus.android-junit5") version "1.8.2.1" apply false
}