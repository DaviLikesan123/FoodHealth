package br.com.fiap.foodhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.foodhealth.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}