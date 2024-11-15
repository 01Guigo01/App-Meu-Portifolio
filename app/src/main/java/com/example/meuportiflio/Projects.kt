package com.example.meuportiflio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meuportiflio.databinding.ActivityProjectsBinding

class Projects : AppCompatActivity() {
    private lateinit var binding: ActivityProjectsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbarProject = binding.toolbarProjects
        toolbarProject.setOnClickListener{
            finish()
        }
    }
}