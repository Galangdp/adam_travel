package com.example.adamstravel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.adamstravel.databinding.ActivityLoginBinding

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val btnCrtAcc: TextView = findViewById(R.id.btn_create_acc)
        btnCrtAcc.setOnClickListener(this)

        binding.btnLogin.setOnClickListener {
            if (binding.inputemail.text.toString() == "adamgroup@gmail.com" && binding.inputpassword.text.toString() == "adam123") {
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            }else {
                Toast.makeText(this, "Email atau Password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_create_acc -> startActivity(Intent(this, Sign::class.java))
        }
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
