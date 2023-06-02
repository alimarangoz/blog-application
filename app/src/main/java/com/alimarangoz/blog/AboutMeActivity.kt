package com.alimarangoz.blog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.net.Uri
import android.view.MenuItem
import android.widget.ImageButton

class AboutMeActivity : AppCompatActivity() {

    lateinit var springBtn : ImageButton
    lateinit var javaBtn : ImageButton
    lateinit var mysqlBtn : ImageButton
    lateinit var nodeBtn : ImageButton
    lateinit var kotlinBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        springBtn = findViewById(R.id.spring_btn)
        springBtn.setOnClickListener {
            val url = "https://spring.io/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        javaBtn = findViewById(R.id.java_btn)
        javaBtn.setOnClickListener {
            val url = "https://docs.oracle.com/en/java/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        mysqlBtn = findViewById(R.id.my_sql_btn)
        mysqlBtn.setOnClickListener {
            val url = "https://dev.mysql.com/doc/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        nodeBtn = findViewById(R.id.node_btn)
        nodeBtn.setOnClickListener {
            val url = "https://nodejs.org/en"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        kotlinBtn = findViewById(R.id.kotlin_btn)
        kotlinBtn.setOnClickListener {
            val url = "https://kotlinlang.org/"
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