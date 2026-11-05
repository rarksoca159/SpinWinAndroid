plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.arcadelab.spinwin"
    compileSdk = 35

    // Fix Java and Kotlin JVM target mismatch
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    androidResources {
        // SoundPool uses AssetFileDescriptor, which requires uncompressed OGG assets.
        noCompress += "ogg"
    }

    defaultConfig {
        applicationId = "com.arcadelab.spinwin"
        minSdk = 23
        targetSdk = 35
        versionCode = 2
        versionName = "1.0-dev"
    }
}
