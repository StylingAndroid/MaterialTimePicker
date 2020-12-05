const val kotlinVersion = "1.4.20"
const val hiltVersion = "2.30.1-alpha"

object BuildPlugins {
    object Version {
        const val androidBuildToolsVersion = "7.0.0-alpha02"
        const val versionsVersion = "0.33.0"
        const val detektVersion = "1.14.1"
        const val ktlintVersion = "9.4.0"
        const val canidropjetifierVersion = "0.5"
    }

    const val versions = "com.github.ben-manes.versions"
    const val detekt = "io.gitlab.arturbosch.detekt"
    const val ktlint = "org.jlleitschuh.gradle.ktlint"
    const val canidropjetifier = "com.github.plnice.canidropjetifier"

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Version.androidBuildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val hiltAndroidPlugin = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"

    const val versionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${Version.versionsVersion}"
    const val detektPlugin = "$detekt:detekt-gradle-plugin:${Version.detektVersion}"
    const val ktlintPlugin = "org.jlleitschuh.gradle:ktlint-gradle:${Version.ktlintVersion}"
    const val canidropjetifierPlugin = "com.github.plnice:canidropjetifier:${Version.canidropjetifierVersion}"
}

object AndroidSdk {
    const val min = 23
    const val compile = 30
    const val target = compile
}


object Libraries {
    private object Versions {
        const val appCompat = "1.3.0-alpha02"
        const val ktx = "1.5.0-alpha05"
        const val hilt = "1.0.0-alpha02"
        const val asyncLayoutInflater = "1.0.0"
        const val viewModel = "2.3.0-beta01"
        const val fragment = "1.3.0-beta02"
        const val material = "1.3.0-alpha04"
        const val constraintLayout = "2.1.0-alpha1"
        const val vectorDrawable = "1.2.0-alpha02"
        const val coreLibraryDesugaring = "1.0.9"
        const val timber = "4.7.1"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val asyncLayoutInflater = "androidx.asynclayoutinflater:asynclayoutinflater:${Versions.asyncLayoutInflater}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val ktxFragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
    const val hiltLifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:${Versions.vectorDrawable}"
    const val coreLibraryDesugaring = "com.android.tools:desugar_jdk_libs:${Versions.coreLibraryDesugaring}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}
