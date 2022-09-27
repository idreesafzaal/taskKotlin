package com.commscope.codingchallengekt

import android.accounts.AccountManager.get
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionBarPolicy.get
import com.squareup.picasso.Picasso

class ImageActivity : AppCompatActivity()
{
    val IMAGE_URL = "https://i.imgur.com/DvpvklR.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
       // title = "Picasso"
      var img=findViewById<ImageView>(R.id.image_view)
        Picasso.with(this).load(IMAGE_URL).into(img)

    }
}