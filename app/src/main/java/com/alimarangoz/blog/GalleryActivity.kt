package com.alimarangoz.blog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.MenuItem
import android.widget.GridView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayoutStates
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GalleryActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val images = listOf(
            R.drawable.my_image,
            R.drawable.my_image,
            R.drawable.my_image,
            R.drawable.my_image,
            R.drawable.my_image,
            R.drawable.my_image
        )

        recyclerView = findViewById(R.id.image_gallery_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = ImageAdapter(images)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}