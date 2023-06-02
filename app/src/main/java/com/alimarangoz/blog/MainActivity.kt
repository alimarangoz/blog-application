package com.alimarangoz.blog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var aboutMeBtn : Button
    lateinit var galleryBtn : Button
    lateinit var contactBtn : Button
    lateinit var blogBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aboutMeBtn = findViewById(R.id.about_me_btn)
        galleryBtn = findViewById(R.id.gallery_btn)
        contactBtn = findViewById(R.id.contact_btn)
        blogBtn = findViewById(R.id.blog_btn)

        aboutMeBtn.setOnClickListener {
            var intent = Intent(this, AboutMeActivity::class.java)
            startActivity(intent)
        }
        galleryBtn.setOnClickListener {
            var intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }
        contactBtn.setOnClickListener {
            var intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
        blogBtn.setOnClickListener {
            var intent = Intent(this, BlogActivity::class.java)
            startActivity(intent)
        }

    }
}