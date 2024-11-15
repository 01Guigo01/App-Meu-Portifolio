package com.example.meuportiflio

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meuportiflio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profilePhoto = BitmapFactory.decodeResource(resources, R.drawable.gui)
        val circle = RoundedBitmapDrawableFactory.create(resources, profilePhoto)
        circle.isCircular = true
        binding.imgProfilePhoto.setImageDrawable(circle)


        binding.btnProjects.setOnClickListener(){
            val intent = Intent(this, Projects::class.java)
            startActivity(intent)
        }

        binding.btnContato.setOnClickListener(){
            val intent = Intent(this, Contacts::class.java)
            startActivity(intent)
        }
    }
}