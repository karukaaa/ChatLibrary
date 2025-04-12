package com.example.chatlibrary
import android.content.Context
import android.widget.Toast

object TestFeature {
    fun showTestToast(context: Context) {
        Toast.makeText(context, "Hello from the ChatLibrary 🎉", Toast.LENGTH_SHORT).show()
    }
}