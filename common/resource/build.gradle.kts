plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply(from = "${project.rootDir}/compose.gradle")
apply(from = "${project.rootDir}/android.gradle")

android {
    namespace = "dev.tuna.leechunbok.resource"
}