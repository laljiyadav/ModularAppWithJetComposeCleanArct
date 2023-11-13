object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompt}" }
    val runtimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeKtx}" }
    val composeKtx by lazy { "androidx.activity:activity-compose:${Versions.compose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial by lazy { "androidx.compose.material3:material3" }
    val composejunit by lazy { "junit:junit:${Versions.composeJunit}" }
    val extjunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val composeUITest by lazy { "androidx.compose.ui:ui-test-junit4" }
    val composeUITooling by lazy { "androidx.compose.ui:ui-tooling" }
    val composeUITestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val daggerHiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.daggerHiltAndroid}" }
    val daggerHiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.daggerHiltAndroidCompiler}" }
    val androidXHiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.androidXHiltCompiler}" }

    val androidXHiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.androidXNavigationCompose}" }

    val retrofitSquare by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit2}" }
    val okHttp  by lazy { "com.squareup.okhttp3:okhttp:${Versions.okHttp}" }

    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}" }
    val moshi  by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshiKotlin}" }
    val moshiConverter  by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }
    val loggingInterrcepter  by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.intercepterLogging}" }

    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesCore}" }

}
object Modules{
    const val utility=":utility"
}