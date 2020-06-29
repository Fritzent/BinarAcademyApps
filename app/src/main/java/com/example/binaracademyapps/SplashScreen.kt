package com.example.binaracademyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    // make delaye 4 sec
    private val SPLAHS_TIME: Long = 4000

    //note : find a way to change a text on the QoutesList with the String from String.xml
    private val listOfQoutes = listOf(
        QoutesList("\"Action is the foundational key to all success.\" ", "~Pablo Picasso"),
        QoutesList("\"Let\'s unlock your greatest potential! You\'re the gift, You\'re the inspiration.\"", "~Alamanda Shantika"),
        QoutesList("\"Ever Tried. Ever Failed. No Matter. Try Again. Fall Again. Fail Better.\"", "~Samuel Beckett"),
        QoutesList("\"A person who never made a mistake never tried anything new.\"", "~Albert Einstein")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val getQuote = listOfQoutes.random()

        QuoteText.text = getQuote.qoutesText
        QuotePerson.text = getQuote.qoutesPerson

        //using handler to handle the delay of splashscreen
        Handler().postDelayed({
            //here to make a intent into the main activity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLAHS_TIME)
    }
}
