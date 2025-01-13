plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "org.d3if0023.mymodul1"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.d3if0023.mymodul1"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.viewmodel.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // view model
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    // moshi
    implementation("com.squareup.moshi:moshi:1.9.2")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
// retrofit
    implementation("com.squareup.retrofit2:retrofit:2.8.1")
    implementation("com.squareup.retrofit2:converter-moshi:2.8.1")

    implementation ("androidx.multidex:multidex:2.0.1")
    // live data
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    // recycler view
    implementation("androidx.recyclerview:recyclerview:1.3.1")

    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
}

