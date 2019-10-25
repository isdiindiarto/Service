package com.example.service_078

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_google.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com/Login/identifier?hl=ID&flowName=GlifWebSignIn&flowEntry=AddSession"))
            startActivity(intent)
        })
        btn_instagram.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/?hl=id"))
            startActivity(intent)
        })

        var MediaPlayer:MediaPlayer? = MediaPlayer.create(this, R.raw.iso)

        play.setOnClickListener{
            MediaPlayer?.start()
        }
        pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        stop.setOnClickListener{
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)
        }
    }
}
