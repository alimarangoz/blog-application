package com.alimarangoz.blog

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.MenuItem
import android.widget.TextView

class ContactActivity : AppCompatActivity() {

    lateinit var email : TextView
    lateinit var github : TextView
    lateinit var linkedin : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        email = findViewById(R.id.email)
        github = findViewById(R.id.github)
        linkedin = findViewById(R.id.linkedin)

        email.setText(Html.fromHtml("<a href=\"mailto:ali.marangoz1999@gmail.com\">ali.marangoz1999@gmail.com</a>"));
        email.setMovementMethod(LinkMovementMethod.getInstance());
        github.setText("https://github.com/alimarangoz")
        linkedin.setText("https://www.linkedin.com/in/ali-marangoz-794760194/")

        github.setOnClickListener {
            val url = "https://github.com/alimarangoz"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        linkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/ali-marangoz-794760194/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}