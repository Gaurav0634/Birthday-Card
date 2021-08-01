package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birth_day_greeting.*




class BirthDayGreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_greeting)
val name = intent.getStringExtra("name")
        birthdaygreetings.text = " Happy Birthday\n$name "
    }
}