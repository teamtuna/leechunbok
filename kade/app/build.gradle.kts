plugins {
    id("com.android.library")
    kotlin("android")
}

apply(from = "${project.rootDir}/android.gradle")
apply(from = "${project.rootDir}/compose.gradle")

android {
    namespace = "dev.tuna.leechunbok.kade"
}

dependencies {
    implementation(project(":common:resource"))
}