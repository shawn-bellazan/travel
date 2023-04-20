
plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.org.jetbrains.dokka)
    alias(libs.plugins.ksp)
    kotlin("kapt")
    alias(libs.plugins.android.hilt)
}

android {
    namespace = "com.example.androidx"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example"
        minSdk = 30
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.5"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildToolsVersion = "33.0.2"
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.android.documentation.plugin)

    // Dependency Injection
    implementation(libs.hilt.navigation)
    implementation(libs.hilt.android)
    implementation(libs.androidx.ui.text.google.fonts)
    kapt(libs.hilt.compiler)

    // Async Programming
    implementation(libs.kotlinx.coroutines.android)

    // Data Persistence
    implementation(libs.room.runtime)
    ksp(libs.room.compiler)

    // Default
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}