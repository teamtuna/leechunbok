plugins {
    id("com.android.application")
    kotlin("android")
}

apply(from = "../android.gradle")
apply(from = "../compose.gradle")

android {
    namespace = "dev.tuna.leechunbok"

    defaultConfig {
        applicationId = "dev.tuna.leechunbok"
    }
}

dependencies {

    implementation(project(":common:resource"))
    implementation(project(":easterdev:app"))
    implementation(project(":robin:app"))
    implementation(project(":whaleshark:app"))
    implementation(project(":noah:app"))
    implementation(project(":kade:app"))
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.5.1")

    // splash screen
    implementation ("androidx.core:core-splashscreen:1.0.0-beta02")
}