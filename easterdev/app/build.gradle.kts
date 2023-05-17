plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

apply(from = "../../android.gradle")
apply(from = "../../compose.gradle")

android {
    namespace = "dev.tuna.leechunbok.easterdev"
}

dependencies {
    implementation(project(":common:resource"))
}