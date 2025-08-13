```kotlin
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.8.10"
}

android {
    namespace = "com.example.safetyapp"
    compileSdk = 30

    defaultConfig {
        applicationId = "com.example.safetyapp"
        minSdk = 25
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.wear:wear:1.2.0")
    implementation("androidx.core:core-ktx:1.6.0")
    // For voice recognition (Days 3-4)
    implementation("androidx.appcompat:appcompat:1.3.1")
    // For location services (Days 7-8)
    implementation("com.google.android.gms:play-services-location:18.0.0")
    // For networking (Day 8)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    // For Bluetooth (Day 9, optional)
    implementation("androidx.core:core:1.6.0")
}
```