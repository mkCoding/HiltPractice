package com.example.hiltpractice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp //Annotation that indicates that my entire app will be using Hilt for DI
class MyApplication:Application() {
}