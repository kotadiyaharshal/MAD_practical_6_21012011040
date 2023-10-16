package com.example.mad_practical_6_21012011040



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val playpause : FloatingActionButton =findViewById(R.id.floatingActionButton)
        val playpause:FloatingActionButton=findViewById(R.id.floatingActionButton)
        // val stop : Button= findViewById(R.id.floatingActionButton7)
        val stop:FloatingActionButton=findViewById(R.id.floatingActionButton7)

        playpause.setOnClickListener { playpause() }
        stop.setOnClickListener { stop() }
    }

    private fun playpause() {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.PLAYERKEY,
            MyService.PLAYERVALUE
        ).apply {
            startService(this)
        }

    }

    private fun stop() {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.PLAYERKEY,
            MyService.PLAYERVALUE
        ).apply {
            stopService(this)

        }
    }
}