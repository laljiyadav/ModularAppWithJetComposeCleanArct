plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.modularappwithjetcomposecleanarct"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.modularappwithjetcomposecleanarct"
        minSdk = 26
        targetSdk = 34
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
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.runtimeKtx)
    implementation(Dependencies.composeKtx)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeGraphics )
    implementation(Dependencies.composeToolingPreview)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)
    testImplementation(Dependencies.composejunit)
    androidTestImplementation(Dependencies.extjunit)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(platform(Dependencies.composeBom))
    androidTestImplementation(Dependencies.composeUITest)
    debugImplementation(Dependencies.composeToolingPreview)
    debugImplementation(Dependencies.composeUITestManifest)
    implementation(project(Modules.utility))

    implementation(Dependencies.daggerHiltAndroid)
    kapt(Dependencies.daggerHiltAndroidCompiler)
    kapt(Dependencies.androidXHiltCompiler)

    implementation(Dependencies.androidXHiltNavigationCompose)
    implementation(Dependencies.retrofitSquare)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.gsonConverter)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.loggingInterrcepter)




}

kapt{
    correctErrorTypes = true
}

