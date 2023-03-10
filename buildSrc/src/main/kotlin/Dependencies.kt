object Dependencies {

    object Android {
        const val androidCoreKtx = "androidx.core:core-ktx:${Versions.Android.androidCoreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.Android.appCompat}"
        const val materialComponents =
            "com.google.android.material:material:${Versions.Android.materialComponents}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.Android.constraintLayout}"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.Android.fragmentKtx}"
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Android.lifecycleKtx}"
        const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Android.livedataKtx}"
        const val collectionsKtx = "androidx.collection:collection-ktx:${Versions.Android.collectionsKtx}"
        const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Android.viewmodelKtx}"
    }

    object Data {
        const val room = "androidx.room:room-runtime:${Versions.Android.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.Android.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.Android.room}"
        const val roomPaging = "androidx.room:room-paging:${Versions.Android.room}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Android.retrofit}"
    }

    object Testing {
        const val JUnit4 = "junit:junit:${Versions.Testing.JUnit4}"
        const val androidJUnit4 = "androidx.test.ext:junit:${Versions.Testing.androidJUnit4}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.Testing.espressoCore}"
    }

    object DI {
        const val dagger2 = "com.google.dagger:dagger:${Versions.DI.dagger2}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.DI.dagger2}"
        const val koin = "io.insert-koin:koin-android:${Versions.DI.koin}"
        const val hilt = "com.google.dagger:hilt-android:${Versions.DI.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.DI.hilt}"
    }
}