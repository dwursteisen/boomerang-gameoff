package com.github.dwursteisen.libgdx

import java.io.File
import java.util.*

object IsAndroidSdk {

    @JvmStatic
    fun isDetected(): Boolean {

        val androidHome = System.getenv()["ANDROID_HOME"] != null && System.getenv()["ANDROID_HOME"] != ""
        val localfile = File("local.properties")
        if (localfile.isFile) {
            val androidProperties = Properties()
            localfile.inputStream().use {
                androidProperties.load(it)
            }
            return androidHome || androidProperties.getProperty("sdk.dir") != null

        }

        return androidHome
    }

}