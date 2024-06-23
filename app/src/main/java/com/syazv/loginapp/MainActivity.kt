package com.syazv.loginapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.syazv.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{
            val intent = Intent()
            intent.putExtra("username", binding.usernameEditText.text.toString())
            intent.putExtra("password", binding.passwordEditText.text.toString())
            intent.action = "testlogin"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            startActivity(intent)

        }
    }
}