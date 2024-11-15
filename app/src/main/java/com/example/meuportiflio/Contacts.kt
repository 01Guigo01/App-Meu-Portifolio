package com.example.meuportiflio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.meuportiflio.databinding.ActivityContactsBinding

class Contacts : AppCompatActivity() {
    private lateinit var binding: ActivityContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbarContact = binding.toolbarContact
        toolbarContact.setNavigationOnClickListener{
            finish()
        }

        binding.btnWp.setOnClickListener{
            openWp()
        }
    }

    private fun openWp() {

        val numberPhone = "5513988241531"
        val uri = Uri.parse("https://wa.me/$numberPhone")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)

        if(numberPhone.equals(numberPhone)){
            startActivity(intent)
        }else{
            val playStoreIntent = Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"))
            startActivity(playStoreIntent)
        }
    }
}
