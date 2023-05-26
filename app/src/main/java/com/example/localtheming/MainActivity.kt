package com.example.localtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.localtheming.ui.LocalSpacing
import com.example.localtheming.ui.spacing
import com.example.localtheming.ui.theme.LocalThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //in this we are trying to customize this Theme provided by android studio
            LocalThemingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //We can access the values passed inside material theme by
                    //MaterialTheme.colors.background and assign this whenever we want

                    // but suppose now i want to add some Spacing value inside this which is not defined default in Material theme wrapper class
                    //  we can do this with the help of "local composition" which provides us some local values
                    // i.e  val context = LocalContext.current.applicationContext
                    // if you open wrapper class we can see all the methods basically returns this local values


                    // now to extend this wrapper class we create new "Spacing.kt" file

                    //after that we can access the values by this way
                    //i.e - LocalSpacing.current.default

                    //or we can also access it using MaterialTheme class also we have to create extension function for this Spacing inside wrapper class

                    //so now we can access it with the help of
                    //MaterialTheme.spacing.default


                    //don't use this if you don't want to use this values on each and every composables in application
                }
            }
        }
    }
}
